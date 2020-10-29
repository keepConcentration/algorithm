package algorithm.programmers.level_one;

/**
 * K번째수
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * 
 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
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
        		System.out.println(i + "번째 tempArr[" + j + "] = " + tempArr[j]);
        	}
        	//System.out.println("-----------end-------------");
        	
        	//Arrays.sort(tempArr);
        	quickSort(tempArr, 0, tempArr.length - 1);
        	answer[i] = tempArr[targetIdx - 1];
        }
        return answer;
    }
	
	// 공부용 quick정렬
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
            	System.out.println("left, right 수 변경");
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
