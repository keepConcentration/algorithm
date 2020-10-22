package algorithm.programmers.level_one;

import java.util.Arrays;

/**
 * �������� ���� ����
 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
 * �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
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
