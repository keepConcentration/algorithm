package algorithm.programmers.level_one;

/**
 * Ű�е� ������
 * 
 * ����Ʈ�� ��ȭ Ű�е��� �� ĭ�� ������ ���� ���ڵ��� ���� �ֽ��ϴ�.
 * 
 * �� ��ȭ Ű�е忡�� �޼հ� �������� �����հ������� �̿��ؼ� ���ڸ��� �Է��Ϸ��� �մϴ�.
 * �� ó�� �޼� �����հ����� * Ű�е忡 ������ �����հ����� # Ű�е� ��ġ���� �����ϸ�, �����հ����� ����ϴ� ��Ģ�� ������ �����ϴ�.
 * 
 * �����հ����� �����¿� 4���� �������θ� �̵��� �� ������ Ű�е� �̵� �� ĭ�� �Ÿ��� 1�� �ش��մϴ�.
 * ���� ���� 3���� ���� 1, 4, 7�� �Է��� ���� �޼� �����հ����� ����մϴ�.
 * ������ ���� 3���� ���� 3, 6, 9�� �Է��� ���� ������ �����հ����� ����մϴ�.
 * ��� ���� 4���� ���� 2, 5, 8, 0�� �Է��� ���� �� �����հ����� ���� Ű�е��� ��ġ���� �� ����� �����հ����� ����մϴ�.
 * 4-1. ���� �� �����հ����� �Ÿ��� ���ٸ�, ���������̴� ������ �����հ���, �޼����̴� �޼� �����հ����� ����մϴ�.
 * ������� ���� ��ȣ�� ��� �迭 numbers, �޼��������� ������������ ���� ��Ÿ���� ���ڿ� hand�� �Ű������� �־��� ��,
 * �� ��ȣ�� ���� �����հ����� �޼��� �� �������� ���� ��Ÿ���� ���ӵ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 * 
 * [���ѻ���]
 * numbers �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
 * numbers �迭 ������ ���� 0 �̻� 9 ������ �����Դϴ�.
 * hand�� "left" �Ǵ� "right" �Դϴ�.
 * "left"�� �޼�����, "right"�� ���������̸� �ǹ��մϴ�.
 * �޼� �����հ����� ����� ���� L, ������ �����հ����� ����� ���� R�� ������� �̾�ٿ� ���ڿ� ���·� return ���ּ���.
 * @author keepConcentration
 */
public class PressKeypad {
	
	public static void main(String[] args) {
		System.out.println(new PressKeypad()
				//.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
				.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
				//.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
	}

	public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftNum = 10;
        int rightNum = 12;
        for (int i = 0; i < numbers.length; ++i) {
        	if (numbers[i] % 3 == 1) {
        		answer += "L";
        		leftNum = numbers[i];
        		continue;
        	}
        	if (numbers[i] != 0 && numbers[i] % 3 == 0) {
        		answer += "R";
        		rightNum = numbers[i];
        		continue;
        	}
        	String thisAnswer = middleDigitHandCompute(numbers[i] == 0 ? 11 : numbers[i], leftNum, rightNum, hand);
        	answer += thisAnswer;
        	if (thisAnswer.equals("L")) {
        		leftNum = numbers[i] == 0 ? 11 : numbers[i];
        	} else {
        		rightNum = numbers[i] == 0 ? 11 : numbers[i];
        	}
        }
        return answer;
    }
	
	public String middleDigitHandCompute(int targetNum, int leftNum, int rightNum, String hand) {
		String answer = "";
		if (rightNum - leftNum == 2) {
			answer = hand.equals("left") ? "L" : "R";
		} else if (leftNum == targetNum) {
			answer = "L";
		} else if (rightNum == targetNum) {
			answer = "R";
		} else {
			int leftDistance = 0;
			int rightDistance = 0;
			
			int leftTargetMinus = (int)Math.abs(targetNum - leftNum);
			int rightTargetMinus = (int)Math.abs(targetNum - rightNum);
			switch (leftTargetMinus) {
				case 1 :
				case 3 : leftDistance = 1; break;
				case 2 :
				case 4 :
				case 6 : leftDistance = 2; break;
				case 5 :
				case 7 :
				case 9 : leftDistance = 3; break;
				case 8 :
				case 10 : leftDistance = 4; break;
			}
			
			switch (rightTargetMinus) {
				case 1 :
				case 3 : rightDistance = 1; break;
				case 2 :
				case 4 :
				case 6 : rightDistance = 2; break;
				case 5 :
				case 7 :
				case 9 : rightDistance = 3; break;
				case 8 :
				case 10 : rightDistance = 4; break;
			}
			if (leftDistance == rightDistance) {
				answer = hand.equals("left") ? "L" : "R";
			} else {
				answer = leftDistance < rightDistance ? "L" : "R";
			}
			
		}
		return answer;
	}
}
