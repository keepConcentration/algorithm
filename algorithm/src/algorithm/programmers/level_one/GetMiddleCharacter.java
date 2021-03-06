package algorithm.programmers.level_one;

/**
 * 가운데 글자 가져오기
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
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
