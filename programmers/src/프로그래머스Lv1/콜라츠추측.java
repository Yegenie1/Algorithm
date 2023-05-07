package 프로그래머스Lv1;

public class 콜라츠추측 {

	public static void main(String[] args) {
		long num = 626331;
		int answer = 0;
		if (num == 1) {
			answer = 0;
		} else {
			for (answer = 0; num != 1; answer++) {
				if (num % 2 == 0) {
					num /= 2;
				} else {
					num = num * 3 + 1;
				}
			}
			if (answer > 500) {
				answer = -1;
			}
		}
		System.out.println(answer);

	}

}
