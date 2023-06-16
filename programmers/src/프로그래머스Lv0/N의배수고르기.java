package 프로그래머스Lv0;

import java.util.ArrayList;

public class N의배수고르기 {

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i]%n == 0) {
				list.add(numlist[i]);
			}
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		for (int i : answer) {
			System.out.println(i);
		}
		

	}

}
