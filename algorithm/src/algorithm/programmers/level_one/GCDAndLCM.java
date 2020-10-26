package algorithm.programmers.level_one;

/**
 * �ִ������� �ּҰ����
 * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������.
 * �迭�� �� �տ� �ִ�����, �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�.
 * ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.
 * @author keepConcentration
 */
public class GCDAndLCM {
	
	public static void main(String[] args) {
		System.out.println(new GCDAndLCM()
				.solution(3, 12));
	}

	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if (n % m == 0) {
        	answer[0] = m;
        	answer[1] = n;
        	return answer;
        } else if (m % n == 0) {
        	answer[0] = n;
        	answer[1] = m;
        	return answer;
        }
    	// �ִ�����
    	int divisor = n < m ? m / 2 : n / 2;
    	for (int i = divisor; i > 0; --i) {
    		if (n % i == 0 && m % i == 0) {
    			answer[0] = i;
    			break;
    		}
    	}
        
        // �ּҰ����
        int paramN = n;
        int paramM = m;
        int result = 1;
        int multi = 2;
        while (paramN > multi && paramM > multi) {
        	if (paramN % multi != 0 || paramM % multi != 0) {
        		++multi;
        		continue;
        	}
        	paramN /= multi;
        	paramM /= multi;
        	result *= multi;
        }
        result *= paramM * paramN;
        answer[1] = result;
        return answer;
    }
}
