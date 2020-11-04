package algorithm.programmers.level_two;

/**
 * 가장 큰 수
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 * 
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한 사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 * @author keepConcentration
 */
public class LargestNumber {
	
	public static void main(String[] args) {
		System.out.println(new LargestNumber()
				//.solution(new int[] {6, 10, 2}));
				.solution(new int[] {34, 340, 343}));
		new LargestNumber().test(new int[] {3, 30, 34});
	}
	public void test(int[] numbers) {
		String[] strArr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length; ++i) {
        	strArr[i] = String.valueOf(numbers[i]);
        }
        quickSort(strArr, 0, strArr.length - 1);
        for (int i = 0; i < strArr.length; ++i) {
        	String str = strArr[i];
        	for (int j = i + 1; j < str.length(); ++j) {
        		
        	}
        }
	}

	public String solution(int[] numbers) {
        String[] strArr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length; ++i) {
        	strArr[i] = String.valueOf(numbers[i]);
        }
        
        quickSort(strArr, 0, strArr.length - 1);
        quickSortByLength(strArr, 0, strArr.length - 1);
        
        for (int i = 0; i < numbers.length; ++i) {
        	//System.out.println(strArr[i]);
        	sb.append(strArr[i]);
        }
        
        return sb.toString();
    }
	
	public void quickSort(String[] target, int left, int right) {
		int paramLeft = left;
		int paramRight = right;
		String pivot = target[(paramLeft + paramRight) / 2];
		do {
			while (target[paramLeft].compareTo(pivot) > 0) {
				paramLeft++;
			}
			while (target[paramRight].compareTo(pivot) < 0) {
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
			quickSort(target, left, paramRight);
		}
		if (paramLeft < right) {
			quickSort(target, paramLeft, right);
		}
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
