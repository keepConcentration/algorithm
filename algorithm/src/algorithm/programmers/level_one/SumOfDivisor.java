package algorithm.programmers.level_one;

/**
 * ����� ��
 * ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
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
