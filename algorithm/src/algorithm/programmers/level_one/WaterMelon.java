package algorithm.programmers.level_one;

/**
 * ���ڼ��ڼ��ڼ��ڼ��ڼ�?
 * ���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
 * @author keepConcentration
 */
public class WaterMelon {
	
	public static void main(String[] args) {
		System.out.println(new WaterMelon()
				.solution(3));
	}

	public String solution(int n) {
        String answer = "";
        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; ++i) {
                answer += "����";
            }
            return answer;
        }
        for (int i = 1; i <= n / 2; ++i) {
            answer += "����";
        }
        answer += "��";
        return answer;
    }
}
