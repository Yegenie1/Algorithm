package 프로그래머스Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 가장작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {5, 2, 1, 1};
		int[] answer = {};

		//int[] arr2 = arr.clone();
		Arrays.sort(arr);
		
		int num = arr[0];

		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > num) {
					list.add(arr[i]);
				}
			}
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}

		System.out.println(Arrays.toString(answer));

	}

}
