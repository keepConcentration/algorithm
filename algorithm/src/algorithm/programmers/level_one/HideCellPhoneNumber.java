package algorithm.programmers.level_one;

/**
 * 핸드폰 번호 가리기
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 "*"으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 * @author keepConcentration
 */
public class HideCellPhoneNumber {
	
	public static void main(String[] args) {
		System.out.println(new HideCellPhoneNumber()
				.solution("01033334444"));
	}

	public String solution(String phone_number) {
        int paramLength = phone_number.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < paramLength - 4; ++i) {
			sb.append("*");
		}
		sb.append(phone_number.substring(paramLength - 4, paramLength));
        return sb.toString();
    }
}
