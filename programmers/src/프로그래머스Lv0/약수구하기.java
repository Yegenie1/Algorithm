package 프로그래머스Lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				a.add(i);
			}
		}
		Collections.sort(a);
		System.out.println(a.toString());
		
	}

}
