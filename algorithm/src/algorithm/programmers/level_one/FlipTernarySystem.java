package algorithm.programmers.level_one;

/**
 * 3���� ������
 * �ڿ��� n�� �Ű������� �־����ϴ�. n�� 3���� �󿡼� �յڷ� ������ ��, �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
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
        // 10����
        String[] str10 = sb.toString().split("");
        int multi = 1;
        for (int i = str10.length - 1; i >= 0; --i) {
        	answer += Integer.parseInt(str10[i]) * multi;
        	multi *= 3;
        }
        return answer;
    }
}
