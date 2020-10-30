package algorithm.programmers.level_one;

/**
 * �̻��� ���� �����
 * ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�.
 * �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
 * �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * @author keepConcentration
 */
public class CreateStrangeCharacter {
	
	public static void main(String[] args) {
		System.out.println(new CreateStrangeCharacter()
				.solution("try hello world"));
	}

	public String solution(String s) {
		String answer = "";
        int sLength = s.length();
        boolean isUpper = true;
        for (int i = 0; i < sLength; ++i) {
        	String substr = s.substring(i, i + 1);
        	if (" ".equals(substr)) {
        		isUpper = true;
        		answer += " ";
        		continue;
        	}
        	
        	if (isUpper) {
        		answer += substr.toUpperCase();
        		isUpper = false;
        	} else {
        		answer += substr.toLowerCase();
        		isUpper = true;
        	}
        
        }
        return answer;
    }
}
