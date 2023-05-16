package 프로그래머스Lv0;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {

	public static void main(String[] args) {
		int n = 12;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 2; i <= n; i++) {
			if (n%i==0) {
				while (n%i==0) {
					n = n/i;	
				}
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		for (int i : answer) {
			System.out.println(i);
		}

	}

}
