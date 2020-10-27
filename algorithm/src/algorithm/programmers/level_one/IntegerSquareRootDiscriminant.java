package algorithm.programmers.level_one;

/**
 * ���� ������ �Ǻ�
 * ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
 * @author keepConcentration
 */
public class IntegerSquareRootDiscriminant {
	
	public static void main(String[] args) {
		System.out.println(new IntegerSquareRootDiscriminant()
				.solution(121L));
	}

	public long solution(long n) {
        double dbSqrt = Math.sqrt(n);
        double dbFloor = (int)Math.floor(dbSqrt);
        if (dbFloor++ == dbSqrt) {
        	return (long)(dbFloor * dbFloor);
        }
        return -1L;
    }
}
