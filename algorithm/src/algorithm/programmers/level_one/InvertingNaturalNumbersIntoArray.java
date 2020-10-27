package algorithm.programmers.level_one;

/**
 * �ڿ��� ������ �迭�� �����
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
 * ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
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
