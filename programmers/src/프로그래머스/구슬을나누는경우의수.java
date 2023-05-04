package 프로그래머스;

import java.math.BigInteger;

public class 구슬을나누는경우의수 {

	public static void main(String[] args) {
		BigInteger answer = BigInteger.valueOf(1);
		int balls = 30;
		int share = 15;

		for (long i = balls; i > share; i--) {
			answer = answer.multiply(BigInteger.valueOf(i));
		}
		for (int i = 1; i <= balls - share; i++) {
			answer = answer.divide(BigInteger.valueOf(i));
		}
		
		System.out.println(answer.intValue());

	}

}
