package algorithm.programmers.level_one;

/**
 * 시저 암호
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
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
