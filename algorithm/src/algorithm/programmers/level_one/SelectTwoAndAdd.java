package algorithm.programmers.level_one;

import java.util.ArrayList;
import java.util.List;

/**
 * 두 개 뽑아서 더하기
 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 * @author keepConcentration
 */
public class SelectTwoAndAdd {
	
	public static void main(String[] args) {
		System.out.println(new SelectTwoAndAdd()
				.solution(new int[] {2, 1, 3, 4, 1}));
	}

	public int[] solution(int[] numbers) {
        List<Integer> sumList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; ++i) {
        	for (int j = i; j < numbers.length; ++j) {
        		if (i != j && !sumList.contains(numbers[i] + numbers[j])) {
        			sumList.add(numbers[i] + numbers[j]);
        		}
        	}
        }
        listQuickSort(sumList, 0, sumList.size() - 1);
        
        int[] answer = new int[sumList.size()];
        for (int i = 0; i < sumList.size(); ++i) {
        	answer[i] = sumList.get(i);
        }
        
        return answer;
    }
	
	private void listQuickSort(List<Integer> list, int left, int right) {
		int paramLeft = left;
		int paramRight = right;
		int pivot = list.get((paramLeft + paramRight) / 2);
		
		do {
			while (list.get(paramLeft) < pivot) {
				paramLeft++;
			}
			
			while (pivot < list.get(paramRight)) {
				paramRight--;
			}
			
			if (paramLeft <= paramRight) {
				int temp = list.get(paramLeft);
				list.set(paramLeft, list.get(paramRight));
				list.set(paramRight, temp);
				paramLeft++;
				paramRight--;
			}
		} while (paramLeft <= paramRight);
		
		if (left < paramRight) {
			listQuickSort(list, left, paramRight);
		}
		if (paramLeft < right) {
			listQuickSort(list, paramLeft, right);
		}
	}
}
