package algorithm.programmers.level_one;

import java.util.Arrays;

/**
 * 문자열 내림차순으로 배치하기
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * @author keepConcentration
 */
public class PlacingStringsInDescendingOrder {
	
	public static void main(String[] args) {
		System.out.println(new PlacingStringsInDescendingOrder()
				.solution("Zbcdefg"));
	}

	public String solution(String s) {
		String lowerStr = "";
		String upperStr = "";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (char cha : charArr) {
        	if (cha > 96) {
        		lowerStr += cha;
        	} else {
        		upperStr += cha;
        	}
        }
        
        return new StringBuilder(lowerStr).reverse().toString() + new StringBuilder(upperStr).reverse().toString();
    }
}
