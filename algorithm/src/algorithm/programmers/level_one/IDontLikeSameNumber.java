package algorithm.programmers.level_one;

import java.util.ArrayList;
import java.util.List;

/**
 * ���� ���ڴ� �Ⱦ�
 * �迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�.
 * �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�.
 * ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
 * arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
 * arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
 * �迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
 * @author keepConcentration
 */
public class IDontLikeSameNumber {
	
	public static void main(String[] args) {
		System.out.println(new IDontLikeSameNumber()
				.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
	}

	public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
        int answerIdx = 0;
        int paramLength = arr.length;
        
        for (int i = 0; i < paramLength; ++i) {
        	if (list.get(answerIdx) != arr[i]) {
        		list.add(arr[i]);
        		answerIdx++;
        	}
        }
        
        int size = list.size();
        int[] answer = new int[size];
        
        for (int i = 0; i < size; ++i) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
