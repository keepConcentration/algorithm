package algorithm.programmers.level_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ������ �������� ���� �迭
 * array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���. 
 * divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
 * @author keepConcentration
 */
public class DividingArrayOfNumbers {
	
	public static void main(String[] args) {
		System.out.println(new DividingArrayOfNumbers()
				.solution(new int[]{5, 9, 7, 10}, 5));
	}

	public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
		for (int ele : arr) {
			if (ele % divisor == 0) {
				list.add(ele);
			}
		}
        
        int size = list.size();
        if (size == 0) {
        	return new int[]{-1};
        }
        
        int[] answer = new int[size];
        for (int i = 0; i < size; ++i) {
        	answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
