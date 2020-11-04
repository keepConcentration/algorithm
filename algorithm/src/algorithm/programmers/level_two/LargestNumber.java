package algorithm.programmers.level_two;

/**
 * ���� ū ��
 * 0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
 * ���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.
 * 
 * 0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 * ���� ����
 * numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
 * numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
 * ������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.
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
