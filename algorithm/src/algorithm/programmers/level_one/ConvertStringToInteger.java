package algorithm.programmers.level_one;

/**
 * ���ڿ��� ������ �ٲٱ�
 * ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * @author keepConcentration
 */
public class ConvertStringToInteger {
	
	public static void main(String[] args) {
		System.out.println(new ConvertStringToInteger()
				.solution("1234"));
	}

	public int solution(String s) {
        return Integer.parseInt(s);
    }
}
