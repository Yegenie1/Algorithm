package 프로그래머스Lv0;

import java.util.Arrays;

public class 가까운수 {
public static void main(String[] args) {
	int[] array = {3, 10, 28};
	int n = 20;
	int answer = 0;
	Arrays.sort(array);
	for (int i = 0; i < array.length; i++) {
		if (array[i] >= n) {
			int left = n - array[i-1];
			int right = array[i]-n;
			if (left<=right) {
				answer = array[i-1];
			}else {
				answer = array[i];
			}
		}
		answer = array[array.length-1];
		
	}
	System.out.println(answer);
}
}
