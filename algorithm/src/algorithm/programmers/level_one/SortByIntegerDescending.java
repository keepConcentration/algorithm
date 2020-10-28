package algorithm.programmers.level_one;

import java.util.Arrays;
import java.util.Collections;

/**
 * ���� ������������ ��ġ�ϱ�
 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�.
 * n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���.
 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
 * @author keepConcentration
 */
public class SortByIntegerDescending {
	
	public static void main(String[] args) {
		System.out.println(new SortByIntegerDescending()
				.solution(118372));
	}

	public long solution(long n) {
        String s = String.valueOf(n);
        String[] strArr = new String[s.length()];
        for (int i = 0; i < strArr.length; ++i) {
        	strArr[i] = s.substring(i, i + 1);
        }
        Arrays.sort(strArr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String ele : strArr) {
        	sb.append(ele);
        }
        return Long.parseLong(sb.toString());
    }
}
