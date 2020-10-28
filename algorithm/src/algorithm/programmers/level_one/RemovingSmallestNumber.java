package algorithm.programmers.level_one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ���� ���� �� �����ϱ�
 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���.
 * ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
 * @author keepConcentration
 */
public class RemovingSmallestNumber {
	
	public static void main(String[] args) {
		System.out.println(new RemovingSmallestNumber()
				.solution(new int[]{4, 3, 2, 1}));
	}
	
	public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int min = Integer.MAX_VALUE;
		for (int ele : list) {
			if (min > ele) {
				min = ele;
			}
		}
		
		if (list.size() == 0) {
            int[] result = {-1};
            return result;
        }
		
        int[] answer = new int[list.size()];
        
		for (int i = 0; i < list.size(); ++i) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}
