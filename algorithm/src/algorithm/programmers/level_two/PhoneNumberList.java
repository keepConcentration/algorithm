package algorithm.programmers.level_two;

/**
 * ��ȭ��ȣ ���
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
 * ��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
 * 
 * ������ : 119
 * ���ؿ� : 97 674 223
 * ������ : 11 9552 4421
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��,
 * � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 * ���� ����
 * phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
 * �� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
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
