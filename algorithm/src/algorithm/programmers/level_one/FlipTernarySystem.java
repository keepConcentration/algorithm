package algorithm.programmers.level_one;

/**
 * 3진법 뒤집기
 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 * @author keepConcentration
 */
public class FlipTernarySystem {
	
	public static void main(String[] args) {
		System.out.println(new FlipTernarySystem()
				.solution(45));
	}

	public int solution(int n) {
		int answer = 0;
        int param = n;
        StringBuilder sb = new StringBuilder();
        while (param > 0) {
        	sb.append(String.valueOf(param % 3));
        	param = param / 3;
        }
        // 10진법
        String[] str10 = sb.toString().split("");
        int multi = 1;
        for (int i = str10.length - 1; i >= 0; --i) {
        	answer += Integer.parseInt(str10[i]) * multi;
        	multi *= 3;
        }
        return answer;
    }
}
