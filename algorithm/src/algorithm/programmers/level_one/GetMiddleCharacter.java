package algorithm.programmers.level_one;

/**
 * ��� ���� ��������
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 * @author keepConcentration
 */
public class GetMiddleCharacter {
	
	public static void main(String[] args) {
		System.out.println(new GetMiddleCharacter()
				.solution("qwer"));
	}

	public String solution(String s) {
		int length = s.length();
        String answer = length%2 == 1
        		? s.substring(length/2, length/2 + 1)
        		: s.substring(length/2 - 1, length/2 + 1);
        return answer;
    }
}
