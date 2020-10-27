package algorithm.programmers.level_one;

/**
 * 자연수 뒤집어 배열로 만들기
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * @author keepConcentration
 */
public class InvertingNaturalNumbersIntoArray {
	
	public static void main(String[] args) {
		System.out.println(new InvertingNaturalNumbersIntoArray()
				.solution(12345));
	}

	public int[] solution(long n) {
        String reverse = "";
        long param = n;
        while (param > 0) {
	        reverse += param % 10;
	        param /= 10;
        }
        int arrLength = reverse.length();
        int[] answer = new int[arrLength];
        
        for (int i = 0; i < arrLength; ++i) {
            answer[i] = Integer.parseInt(reverse.substring(i, i + 1));
        }
        return answer;
    }
}
