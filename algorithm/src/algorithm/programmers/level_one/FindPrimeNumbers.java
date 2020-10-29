package algorithm.programmers.level_one;

/**
 * �Ҽ� ã��
 * 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.(1�� �Ҽ��� �ƴմϴ�.)
 * @author keepConcentration
 */
public class FindPrimeNumbers {
	
	public static void main(String[] args) {
		System.out.println(new FindPrimeNumbers()
				.solution(10));
	}

	public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; ++i) {
        	int condition = (int)Math.sqrt(i);
        	boolean result = true;
            for (int j = 2; j <= condition; ++j) {
            	if (i % j == 0) {
            		result = false;
            		break;
            	}
            }
            answer += result ? 1 : 0;
        }
        return answer;
    }
}
