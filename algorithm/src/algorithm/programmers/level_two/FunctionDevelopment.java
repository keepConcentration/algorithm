package algorithm.programmers.level_two;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ɰ���
 * ���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
 * 
 * ��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
 * 
 * ���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� �� �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
 * 
 * ���� ����
 * �۾��� ����(progresses, speeds�迭�� ����)�� 100�� �����Դϴ�.
 * �۾� ������ 100 �̸��� �ڿ����Դϴ�.
 * �۾� �ӵ��� 100 ������ �ڿ����Դϴ�.
 * ������ �Ϸ翡 �� ���� �� �� ������, �Ϸ��� ���� �̷�����ٰ� �����մϴ�. ���� ��� �������� 95%�� �۾��� ���� �ӵ��� �Ϸ翡 4%��� ������ 2�� �ڿ� �̷�����ϴ�.
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
        
        // ���� ����
        
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
        	answer[i] = list.get(i);
        	System.out.println(list.get(i));
        }
        return answer;
    }
	
}
