package algorithm.programmers.level_one;

import java.util.Scanner;

/**
 * ���簢�� �����
 * �� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
 * ��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.
 * @author keepConcentration
 */
public class PrintingStarPatternedRectangle {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; ++i) {
            for (int j = 0; j < a; ++j) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
