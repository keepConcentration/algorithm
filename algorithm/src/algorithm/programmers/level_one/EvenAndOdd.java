package algorithm.programmers.level_one;

/**
 * 짝수와 홀수
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 * @author keepConcentration
 */
public class EvenAndOdd {
	
	public static void main(String[] args) {
		System.out.println(new EvenAndOdd()
				.solution(3));
	}

	public String solution(int num) {
        return Math.abs(num) % 2 == 1 ? "Odd" : "Even";
    }
}
