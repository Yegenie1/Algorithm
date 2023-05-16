package 프로그래머스Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열정렬하기 {
	public static void main(String[] args) {
		String my_string = "hi12392";
		String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String[] arr = my_string.split("");
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (arr[i].equals(num[j])) {
					list.add(Integer.parseInt(arr[i]));
				}
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i]=list.get(i);
		}
		Arrays.sort(answer);
		for (int i : answer) {
			System.out.println(i);
		}
		
	}

}
