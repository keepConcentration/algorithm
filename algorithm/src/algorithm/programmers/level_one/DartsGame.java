package algorithm.programmers.level_one;

/**
 * 다트 게임
 * 카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다.
 * 갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다. 다트 게임의 점수 계산 로직은 아래와 같다.
 * 
 * 다트 게임은 총 3번의 기회로 구성된다.
 * 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
 * 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
 * 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
 * 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
 * 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
 * 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
 * Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
 * 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
 * 0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
 * 
 * 입력 형식
 * 점수|보너스|[옵션]으로 이루어진 문자열 3세트.
 * 예) 1S2D*3T
 * 
 * 점수는 0에서 10 사이의 정수이다.
 * 보너스는 S, D, T 중 하나이다.
 * 옵선은 *이나 # 중 하나이며, 없을 수도 있다.
 * 출력 형식
 * 3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.
 * 예) 37
 * @author keepConcentration
 */
public class DartsGame {
	
	public static void main(String[] args) {
		System.out.println(new DartsGame()
				.solution("10T10T*10S"));
	}
	    
    private int score1 = Integer.MIN_VALUE;
    private int score2 = Integer.MIN_VALUE;
    private int score3 = Integer.MIN_VALUE;

	public int solution(String dartResult) {
        String[] strArr = dartResult.split("");
        
        for (int i = 0; i < strArr.length; ++i) {
        	String str = strArr[i];
        	int charToInt = 0;
        	System.out.println("for "+i+": " + str);
        	try {
        		charToInt = Integer.parseInt(str);
        		if (charToInt == 1) {
            		if (strArr[i + 1].equals("0")) {
            			initScore(10);
            			++i;
            		} else {
            			initScore(1);
            		}
            	} else {
            		initScore(charToInt);
            	}
        		
        	} catch (NumberFormatException e) {
        		if (str.equals("D")) {
        			System.out.println("for "+i+": squareD");
        			SquareScore(2);
        		} else if (str.equals("T")) {
        			System.out.println("for "+i+": squareT");
        			SquareScore(3);
        		} else if (str.equals("*")) {
        			starScore();
        		} else if (str.equals("#")) {
        			WastefulScore();
        		}
        	}
        }
        System.out.println(this.getScore1());
        System.out.println(this.getScore2());
        System.out.println(this.getScore3());
        return this.getScore1() + this.getScore2() + this.getScore3();
    }
	
	/**
	 * 점수 초기화
	 * @param score1
	 * @param score2
	 * @param score3
	 * @param score
	 */
	public void initScore(int score) {
		if (this.getScore1() == Integer.MIN_VALUE) {
			this.setScore1(score);
		} else if (this.getScore2() == Integer.MIN_VALUE) {
			this.setScore2(score);
		} else if (this.getScore3() == Integer.MIN_VALUE) {
			this.setScore3(score);
		}
	}
	
	/**
	 * 스타상
	 * @param score1
	 * @param score2
	 * @param score3
	 * @param multi
	 */
	public void starScore() {
		if (this.getScore3() != Integer.MIN_VALUE) {
			this.setScore3(this.getScore3() * 2);
			this.setScore2(this.getScore2() * 2);
		} else if (this.getScore2() != Integer.MIN_VALUE) {
			this.setScore2(this.getScore2() * 2);
			this.setScore1(this.getScore1() * 2);
		} else if (this.getScore1() != Integer.MIN_VALUE) {
			this.setScore1(this.getScore1() * 2);
		}
	}
	
	/**
	 * 아차상
	 * @param score1
	 * @param score2
	 * @param score3
	 * @param multi
	 */
	public void WastefulScore() {
		if (this.getScore3() != Integer.MIN_VALUE) {
			this.setScore3(this.getScore3() * -1);
		} else if (this.getScore2() != Integer.MIN_VALUE) {
			this.setScore2(this.getScore2() * -1);
		} else if (this.getScore1() != Integer.MIN_VALUE) {
			this.setScore1(this.getScore1() * -1);
		}
	}
	
	/**
	 * 점수 제곱
	 * @param score1
	 * @param score2
	 * @param score3
	 * @param multi
	 */
	public void SquareScore(int multi) {
		if (this.getScore3() != Integer.MIN_VALUE) {
			int score3 = this.getScore3();
			if (multi == 3) {
				this.setScore3(score3 * score3 * score3);
			} else {
				this.setScore3(score3 * score3);
			}
		} else if (this.getScore2() != Integer.MIN_VALUE) {
			int score2 = this.getScore2();
			if (multi == 3) {
				this.setScore2(score2 * score2 * score2);
			} else {
				this.setScore2(score2 * score2);
			}
		} else if (this.getScore1() != Integer.MIN_VALUE) {
			int score1 = this.getScore1();
			if (multi == 3) {
				this.setScore1(score1 * score1 * score1);
			} else {
				this.setScore1(score1 * score1);
			}
		}
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		System.out.println("preScore1 : " + this.score1);
		System.out.println("setScore1 : " + score1);
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		System.out.println("preScore2 : " + this.score2);
		System.out.println("setScore2 : " + score2);
		this.score2 = score2;
	}

	public int getScore3() {
		return score3;
	}

	public void setScore3(int score3) {
		System.out.println("preScore3 : " + this.score3);
		System.out.println("setScore3 : " + score3);
		this.score3 = score3;
	}
}
