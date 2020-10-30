package algorithm.programmers.level_one;

/**
 * 이상한 문자 만들기
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
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
