package algorithm.programmers.level_one;

/**
 * ���� ��ȣ
 * � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
 * ���� ��� "AB"�� 1��ŭ �и� "BC"�� �ǰ�, 3��ŭ �и� "DE"�� �˴ϴ�. "z"�� 1��ŭ �и� "a"�� �˴ϴ�.
 * ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
 * @author keepConcentration
 */
public class CaesarCipher {
	
	public static void main(String[] args) {
		System.out.println(new CaesarCipher()
				.solution("a B z", 4));
	}

	public String solution(String s, int n) {
        String answer = "";
        char[] charArr = s.toCharArray();
        final int a = 65;
        final int z = 90;
        final int A = 97;
        final int Z = 122;
        
        for (int i = 0; i < charArr.length; ++i) {
            if (charArr[i] == ' ') {
        		answer += charArr[i];
        		continue;
        	}
            
        	int pwd = (int)charArr[i] + n;
        	if (charArr[i] <= z) {
        		if (pwd > z) {
        			pwd = a - 1 + pwd - z;
        			answer += (char) pwd;
        		} else {
        			answer += (char) pwd;
        		}
        	} else {
        		if (pwd > Z) {
        			pwd = A - 1 + pwd - Z;
        			answer += (char) pwd;
        		} else {
        			answer += (char) pwd;
        		}
        	}
        }
        return answer;
    }
}
