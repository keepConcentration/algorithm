package algorithm.programmers.level_one;

/**
 * ���ڿ� �� p�� y�� ����
 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���.
 * 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�.
 * ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
 * ���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.
 * @author keepConcentration
 */
public class NumberOfPAndYInString {
	
	public static void main(String[] args) {
		System.out.println(new NumberOfPAndYInString()
				.solution("pPoooyY"));
	}

	public boolean solution(String s) {
        String str = " " + s.toUpperCase() + " ";
        int yCnt = str.split("Y").length;
        int pCnt = str.split("P").length;
        return yCnt == pCnt;
    }
}
