package algorithm.programmers.level_one;

/**
 * 정수 제곱근 판별
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
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
