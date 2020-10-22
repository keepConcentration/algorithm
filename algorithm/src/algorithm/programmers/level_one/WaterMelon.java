package algorithm.programmers.level_one;

/**
 * 수박수박수박수박수박수?
 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
 * @author keepConcentration
 */
public class WaterMelon {
	
	public static void main(String[] args) {
		System.out.println(new WaterMelon()
				.solution(3));
	}

	public String solution(int n) {
        String answer = "";
        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; ++i) {
                answer += "수박";
            }
            return answer;
        }
        for (int i = 1; i <= n / 2; ++i) {
            answer += "수박";
        }
        answer += "수";
        return answer;
    }
}
