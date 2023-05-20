package 프로그래머스Lv2;

public class 예상대진표 {

	public static void main(String[] args) {
		//int n = 8;
		int a = 4;
		int b = 7;
		int answer = 0;

		while (true) {
			a = a / 2 + a % 2;
			b = b / 2 + b % 2;
			answer++;
			if (a == b) {
				break;
			}
		}

		System.out.println(answer);

	}

}
