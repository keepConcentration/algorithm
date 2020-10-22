package algorithm.programmers.level_one;

/**
 * ���ڿ� �ٷ�� �⺻
 * ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���.
 * ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
 * @author keepConcentration
 */
public class BasicStringHandling {
	
	public static void main(String[] args) {
		System.out.println(new BasicStringHandling()
				.solution("a234"));
	}

	public boolean solution(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return s.length() == 4 || s.length() == 6;
    }
}
