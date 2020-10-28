package algorithm.programmers.level_one;

import java.util.Arrays;
import java.util.Collections;

/**
 * 정수 내림차순으로 배치하기
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * @author keepConcentration
 */
public class SortByIntegerDescending {
	
	public static void main(String[] args) {
		System.out.println(new SortByIntegerDescending()
				.solution(118372));
	}

	public long solution(long n) {
        String s = String.valueOf(n);
        String[] strArr = new String[s.length()];
        for (int i = 0; i < strArr.length; ++i) {
        	strArr[i] = s.substring(i, i + 1);
        }
        Arrays.sort(strArr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String ele : strArr) {
        	sb.append(ele);
        }
        return Long.parseLong(sb.toString());
    }
}
