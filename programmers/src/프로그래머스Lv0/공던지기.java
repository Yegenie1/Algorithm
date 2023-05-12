package 프로그래머스Lv0;

public class 공던지기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int k = 2;
		int answer = numbers[(k - 1) * 2 % numbers.length];
		System.out.println(answer);

	}

}
