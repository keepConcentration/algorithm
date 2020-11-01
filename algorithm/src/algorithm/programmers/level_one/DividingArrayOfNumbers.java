package algorithm.programmers.level_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 나누어 떨어지는 숫자 배열
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요. 
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
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
