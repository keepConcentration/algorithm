package algorithm.programmers.level_one;

import java.util.Calendar;

/**
 * 2016년
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
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
