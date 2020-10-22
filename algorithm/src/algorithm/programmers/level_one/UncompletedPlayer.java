package algorithm.programmers.level_one;

import java.util.Arrays;

/**
 * 완주하지 못한 선수
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * @author keepConcentration
 */
public class UncompletedPlayer {
	
	public static void main(String[] args) {
		System.out.println(new UncompletedPlayer()
				.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
	}

	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; ++i) {
        	if (!participant[i].equals(completion[i])) {
        		answer = participant[i];
        		break;
        	}
        }
        if (answer.equals("")) {
        	answer = participant[participant.length - 1];
        }
        
        return answer;
    }
}
