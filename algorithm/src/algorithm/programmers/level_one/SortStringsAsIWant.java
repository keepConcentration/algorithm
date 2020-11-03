package algorithm.programmers.level_one;

/**
 * 문자열 내 마음대로 정렬하기
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.
 * 
 * 제한 조건
 * strings는 길이 1 이상, 50이하인 배열입니다.
 * strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 * strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 * 모든 strings의 원소의 길이는 n보다 큽니다.
 * 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 * @author keepConcentration
 */
public class SortStringsAsIWant {
	
	public static void main(String[] args) {
		System.out.println(new SortStringsAsIWant()
				//.solution(new String[] {"sun", "bed", "car"}, 2));
				.solution(new String[] {"asdf", "fdsa", "zxzzz", "zxzzx", "zzzza", "wegewgdfwefd", "zzzzzzzz", "zawergerzz", "zzzzzz"}, 3));
	}

	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        StringBuilder[] sb = new StringBuilder[strings.length];
        
        for (int i = 0 ; i < strings.length; ++i) {
        	sb[i] = new StringBuilder(String.valueOf(strings[i].charAt(n)) + strings[i]);
        }
        quickSort(sb, 0, strings.length - 1);
        
        for (int i = 0 ; i < strings.length; ++i) {
        	System.out.println(sb[i].toString());
        }
        System.out.println("---------------------");
        quickSort(sb, 0, strings.length - 1, n);
        
        for (int i = 0; i < strings.length; ++i) {
        	System.out.println(sb[i].toString());
        	answer[i] = sb[i].toString();
        }
        
        return answer;
    }
	
	public void quickSort(StringBuilder[] sb, int left, int right) {
		int paramLeft = left;
		int paramRight = right;
		StringBuilder pivot = sb[(paramLeft + paramRight) / 2];
		do {
			while (sb[paramLeft].toString().compareTo(pivot.toString()) < 0) {
				paramLeft++;
			}
			while (sb[paramRight].toString().compareTo(pivot.toString()) > 0) {
				paramRight--;
			}
			
			if (paramLeft <= paramRight) {
				StringBuilder temp = sb[paramLeft];
				sb[paramLeft] = sb[paramRight];
				sb[paramRight] = temp;
				paramLeft++;
				paramRight--;
			}
			
		} while (paramLeft <= paramRight);
		if (left < paramRight) quickSort(sb, left, paramRight);
		if (paramLeft < right) quickSort(sb, paramLeft, right);
	}
	
	public void quickSort(StringBuilder[] sb, int left, int right, int idx) {
		int paramLeft = left;
		int paramRight = right;
		String pivot = sb[(paramLeft + paramRight) / 2].substring(idx, sb[(paramLeft + paramRight) / 2].length());
		do {
			while (sb[paramLeft].substring(idx, sb[paramLeft].length()).compareTo(pivot) < 0) {
				paramLeft++;
			}
			while (sb[paramRight].substring(idx, sb[paramRight].length()).compareTo(pivot) > 0) {
				paramRight--;
			}
			
			if (paramLeft <= paramRight) {
				StringBuilder temp = sb[paramLeft];
				sb[paramLeft] = sb[paramRight];
				sb[paramRight] = temp;
				paramLeft++;
				paramRight--;
			}
			
		} while (paramLeft <= paramRight);
		if (left < paramRight) quickSort(sb, left, paramRight, idx);
		if (paramLeft < right) quickSort(sb, paramLeft, right, idx);
	}
}
