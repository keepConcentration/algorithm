package algorithm.programmers.level_one;

/**
 * �ϻ��� ��
 * ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�.
 * ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
 * �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.
 * @author keepConcentration
 */
public class HarshadNumber {
	
	public static void main(String[] args) {
		System.out.println(new HarshadNumber()
				.solution(10));
	}

	public boolean solution(int x) {
        int param = x;
        int sum = 0;
        while (param > 0) {
	        sum += param % 10;
	        param /= 10;
        }
        return x % sum == 0;
    }
}
