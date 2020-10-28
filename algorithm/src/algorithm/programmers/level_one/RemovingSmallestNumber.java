package algorithm.programmers.level_one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 제일 작은 수 제거하기
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
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
