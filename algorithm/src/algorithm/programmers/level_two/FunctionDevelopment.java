package algorithm.programmers.level_two;

import java.util.ArrayList;
import java.util.List;

/**
 * 기능개발
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 * 
 * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 * 
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 * 
 * 제한 사항
 * 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
 * 작업 진도는 100 미만의 자연수입니다.
 * 작업 속도는 100 이하의 자연수입니다.
 * 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
 * @author keepConcentration
 */
public class FunctionDevelopment {
	
	public static void main(String[] args) {
		System.out.println(new FunctionDevelopment()
				.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1}));
				//.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5}));
		
	}

	int date = 1;
	
	public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        int[] dates = new int[progresses.length];
        
        int maxDate = 0;
        
        for (int i = 0; i < progresses.length; ++i) {
        	int progress = 100 - progresses[i];
        	int date = 0;
        	while (progress > 0) {
        		progress -= speeds[i];
        		++date;
        	}
        	dates[i] = date;
        	maxDate = maxDate < date ? date : maxDate;
        	System.out.println("DATE["  +i+"] : " + dates[i]);
        }
        
        
        int cnt = 0;
        int progIdx = 0;
        
        // 개발 예정
        
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
        	answer[i] = list.get(i);
        	System.out.println(list.get(i));
        }
        return answer;
    }
	
}
