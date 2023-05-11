package 프로그래머스Lv1;

public class 부족한금액계산하기 {
	public static void main(String[] args) {
		long answer = -1;
		long price = 3;
		int money = 20;
		int count = 4;
		long sum = 0;
		for (int i = 0; i < count; i++) {
		 sum += price*(1+i);
		}
		if (sum > money) {
			answer = sum - money;
		}else {
			answer = 0;
		}
		System.out.println(answer);
	}

}
