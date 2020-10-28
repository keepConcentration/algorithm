package algorithm.programmers.level_one;

/**
 * �� ���� ������ ��
 * �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * ���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
 * @author keepConcentration
 */
public class SumBetweenTwoIntegers {
	
	public static void main(String[] args) {
		System.out.println(new SumBetweenTwoIntegers()
				.solution(3, 5));
	}

	public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (long i = a; i <= b; ++i) {
                answer += i;
            }
        } else {
            for (long i = a; i >= b; --i) {
                answer += i;
            }
        }
        return answer;
    }
}
