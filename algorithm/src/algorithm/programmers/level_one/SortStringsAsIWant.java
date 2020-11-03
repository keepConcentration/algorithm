package algorithm.programmers.level_one;

/**
 * ���ڿ� �� ������� �����ϱ�
 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.
 * 
 * ���� ����
 * strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
 * strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
 * strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
 * ��� strings�� ������ ���̴� n���� Ů�ϴ�.
 * �ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
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
