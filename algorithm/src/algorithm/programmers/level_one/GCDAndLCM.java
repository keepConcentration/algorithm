package algorithm.programmers.level_one;

/**
 * 최대공약수와 최소공배수
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
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
    	// 최대공약수
    	int divisor = n < m ? m / 2 : n / 2;
    	for (int i = divisor; i > 0; --i) {
    		if (n % i == 0 && m % i == 0) {
    			answer[0] = i;
    			break;
    		}
    	}
        
        // 최소공배수
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
