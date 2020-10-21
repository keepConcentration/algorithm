package algorithm.programmers.level_one;

/**
 * �ڸ��� ���ϱ�
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
 * ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
 * @author keepConcentration
 */
public class AddDigit {
	
	public static void main(String[] args) {
		System.out.println(new AddDigit()
				.solution(123));
	}

	public int solution(int n) {
        int answer = 0;
        int param = n;
        while (param > 0) {
	        answer += param % 10;
	        param /= 10;
        }
        return answer;
    }
}
