package algorithm.programmers.level_one;

/**
 * 평균 구하기
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * @author keepConcentration
 */
public class FindingAverage {
	
	public static void main(String[] args) {
		System.out.println(new FindingAverage()
				.solution(new int[]{1, 2, 3, 4}));
	}

	public double solution(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
        	sum += ele;
        }
        return (double)sum / arr.length;
    }
}
