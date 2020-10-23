package algorithm.programmers.level_one;

/**
 * 문자열을 정수로 바꾸기
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
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
