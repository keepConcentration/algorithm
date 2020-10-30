package algorithm.programmers.level_one;

/**
 * ¦���� Ȧ��
 * ���� num�� ¦���� ��� Even�� ��ȯ�ϰ� Ȧ���� ��� Odd�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
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
