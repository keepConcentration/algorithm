package algorithm.programmers.level_one;

/**
 * 문자열 다루기 기본
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 * 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
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
