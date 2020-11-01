package algorithm.programmers.level_one;

/**
 * ��� ���ϱ�
 * ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
 * @author keepConcentration
 */
public class FindingAverage {
	
	public static void main(String[] args) {
		System.out.println(new FindingAverage()
				.solution(new int[]{1, 2, 3, 4}));
	}

	public double solution(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
        	sum += ele;
        }
        return (double)sum / arr.length;
    }
}
