package algorithm.programmers.level_one;

/**
 * �ڵ��� ��ȣ ������
 * ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� "*"���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
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
