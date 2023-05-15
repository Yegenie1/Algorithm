package 프로그래머스Lv0;

public class 팩토리얼 {

	public static void main(String[] args) {
		int n = 7;
		int answer = 0;
		int factorial = 1;
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num.length; i++) {
			factorial *= num[i];
			if (n >= factorial) {
				answer = num[i];
			}
		}
		System.out.println(answer);

	}

}
