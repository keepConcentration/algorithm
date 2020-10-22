package algorithm.programmers.level_one;

import java.util.Calendar;

/**
 * 2016��
 * 2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��?
 * �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 * ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
 * @author keepConcentration
 */
public class TwentySixteen {
	
	public static void main(String[] args) {
		System.out.println(new TwentySixteen()
				.solution(5, 24));
	}

	public String solution(int a, int b) {
		String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a - 1, b);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
        case 1 : 
            answer = "SUN";
            break;
        case 2 : 
            answer = "MON";
            break;
        case 3 : 
            answer = "TUE";
            break;
        case 4 : 
            answer = "WED";
            break;
        case 5 : 
            answer = "THU";
            break;
        case 6 : 
            answer = "FRI";
            break;
        case 7 : 
            answer = "SAT";
            break;
        }
        
        return answer;
    }
}
