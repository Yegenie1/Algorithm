package 프로그래머스Lv1;

import java.util.ArrayList;
import java.util.List;

public class 삼진법뒤집기 {

	public static void main(String[] args) {
		int n = 45;
		int answer =0;
		List<Integer> num = new ArrayList<>();
		while (n != 0) {
			num.add(n%3);
			n = n/3;
		}
		System.out.println(num);
		for (int i = num.size()-1; i >= 0; i--) {
			answer+=num.get(i)*Math.pow(3, num.size()-1-i);
			System.out.println(answer);
		}
		System.out.println(answer);

	}

}
