package algorithm.programmers.level_one;

import java.util.Arrays;

/**
 * ���ڿ� ������������ ��ġ�ϱ�
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
 * @author keepConcentration
 */
public class PlacingStringsInDescendingOrder {
	
	public static void main(String[] args) {
		System.out.println(new PlacingStringsInDescendingOrder()
				.solution("Zbcdefg"));
	}

	public String solution(String s) {
		String lowerStr = "";
		String upperStr = "";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (char cha : charArr) {
        	if (cha > 96) {
        		lowerStr += cha;
        	} else {
        		upperStr += cha;
        	}
        }
        
        return new StringBuilder(lowerStr).reverse().toString() + new StringBuilder(upperStr).reverse().toString();
    }
}
