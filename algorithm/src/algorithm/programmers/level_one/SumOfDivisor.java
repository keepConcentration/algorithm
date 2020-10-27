package algorithm.programmers.level_one;

/**
 * 약수의 합
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * @author keepConcentration
 */
public class SumOfDivisor {
	
	public static void main(String[] args) {
		System.out.println(new SumOfDivisor()
				.solution(12));
	}

	public int solution(int n) {
        if (n < 3) {
            return n;
        }
        int answer = 1 + n;
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
