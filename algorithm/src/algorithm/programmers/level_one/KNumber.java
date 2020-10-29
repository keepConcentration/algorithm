package algorithm.programmers.level_one;

/**
 * K��°��
 * �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.
 * ���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
 * 
 * array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
 * 1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
 * 2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
 * 
 * �迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * @author keepConcentration
 */
public class KNumber {
	
	public static void main(String[] args) {
		System.out.println(new KNumber()
				.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, 
						new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
	}

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; ++i) {
        	int startIdx	= commands[i][0];
        	int endIdx		= commands[i][1];
        	int targetIdx	= commands[i][2];
        	
        	int[] tempArr = new int[endIdx - startIdx + 1];
        	
        	//System.out.println("-----------start------------- tempArr.length : " + tempArr.length);
        	for (int j = 0; j < tempArr.length; ++j) {
        		tempArr[j] = array[startIdx + j - 1];
        		System.out.println(i + "��° tempArr[" + j + "] = " + tempArr[j]);
        	}
        	//System.out.println("-----------end-------------");
        	
        	//Arrays.sort(tempArr);
        	quickSort(tempArr, 0, tempArr.length - 1);
        	answer[i] = tempArr[targetIdx - 1];
        }
        return answer;
    }
	
	// ���ο� quick����
	void quickSort(int[] arr, int left, int right){
        int paramLeft = left;
        int paramRight = right;
        int pivot = arr[(paramLeft + paramRight) / 2];

        do {
            while (arr[paramLeft] < pivot) {
            	System.out.println("arr[paramLeft] : " + arr[paramLeft] + ", pivot" + pivot);
            	paramLeft++;
            	System.out.println("paramLeft++ : " + paramLeft);
            }
            while (arr[paramRight] > pivot) {
            	System.out.println("arr[paramRight] : " + arr[paramRight] + ", pivot" + pivot);
            	paramRight--;
            	System.out.println("paramRight-- : " + paramRight);
            }
            if (paramLeft <= paramRight) {
            	System.out.println("paramLeft <= paramRight");
            	System.out.println("left, right �� ����");
                int temp = arr[paramLeft];
                arr[paramLeft] = arr[paramRight];
                arr[paramRight] = temp;
                paramLeft++;
                paramRight--;
            }
        } while (paramLeft <= paramRight);

        if (left < paramRight) {
        	quickSort(arr, left, paramRight);
        }
        if (paramLeft < right) {
        	quickSort(arr, paramLeft, right);
        }
    }
}
