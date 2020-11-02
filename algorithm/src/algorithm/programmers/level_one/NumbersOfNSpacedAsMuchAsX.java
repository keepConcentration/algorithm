package algorithm.programmers.level_one;

/**
 * x��ŭ ������ �ִ� n���� ����
 * �Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�.
 * ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * 
 * x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
 * n�� 1000 ������ �ڿ����Դϴ�.
 * @author keepConcentration
 */
public class NumbersOfNSpacedAsMuchAsX {
	
	public static void main(String[] args) {
		System.out.println(new NumbersOfNSpacedAsMuchAsX()
				.solution(-4, 2));
	}

	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        if (x > 0) {
	        for (long i = x; i <= (long)x * n; i += (long)x) {
	        	answer[idx++] = i;
	        }
        } else if (x < 0) {
        	for (long i = x; i >= (long)x * n; i += (long)x) {
	        	answer[idx++] = i;
	        }
        } else {
        	for (int i = 0; i < n; ++i) {
        		answer[i] = 0;
        	}
        }
        return answer;
    }
}
