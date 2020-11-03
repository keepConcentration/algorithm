package algorithm.programmers.level_two;

/**
 * 전화번호 목록
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 * 
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한 사항
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 * @author keepConcentration
 */
public class PhoneNumberList {
	
	public static void main(String[] args) {
		System.out.println(new PhoneNumberList()
				.solution(new String[] {"119", "97674223", "1195524421"}));
		
	}

	public boolean solution(String[] phone_book) {
        quickSortByLength(phone_book, 0, phone_book.length - 1);
        
        for (int i = 0; i < phone_book.length - 1; ++i) {
        	String target = phone_book[i];
        	for (int j = i + 1; j < phone_book.length; ++j) {
        		if (phone_book[j].startsWith(target)) {
        			return false;
        		}
        	}
        }
        return true;
    }
	
	public void quickSortByLength(String[] target, int left, int right) {
		int paramLeft = left;
		int paramRight = right;
		int pivot = target[(paramLeft + paramRight) / 2].length();
		do {
			while (target[paramLeft].length() < pivot) {
				paramLeft++;
			}
			while (pivot < target[paramRight].length()) {
				paramRight--;
			}
			
			if (paramLeft <= paramRight) {
				String temp = target[paramLeft];
				target[paramLeft] = target[paramRight];
				target[paramRight] = temp;
				paramLeft++;
				paramRight--;
			}
		} while(paramLeft <= paramRight);
		
		if (left < paramRight) {
			quickSortByLength(target, left, paramRight);
		}
		if (paramLeft < right) {
			quickSortByLength(target, paramLeft, right);
		}
	}
}
