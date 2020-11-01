package algorithm.programmers.level_one;

/**
 * ���￡�� �輭�� ã��
 * String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 * @author keepConcentration
 */
public class FindKimInSeoul {
	
	public static void main(String[] args) {
		System.out.println(new FindKimInSeoul()
				.solution(new String[] {"Jane", "Kim"}));
	}

	public String solution(String[] seoul) {
        String kim = "Kim";
        for (int i = 0; i < seoul.length; ++i) {
        	if (kim.equals(seoul[i])) {
        		return "�輭���� " + i + "�� �ִ�";
        	}
        }
        return null;
    }
}
