package 프로그래머스Lv0;

import java.util.Arrays;

public class 가까운수 {
	public static void main(String[] args) {
		int[] array = { 3, 10,20, 28 };
		int n = 20;
		int answer = 0;
		Arrays.sort(array);
	    if (array[0] >= n) {
	        answer = array[0];
	    }else {
		    for (int i = 0; i < array.length; i++) {
		        if (array[i] >= n) {
		            int left = n - array[(i - 1)];
		            int right = array[i] - n;
		            answer = left <= right ? array[(i - 1)] : array[i];
		            break;
		        }else if(array[array.length-1] < n) {
		        	answer = array[array.length - 1];
		        }
		    }
	    }
	    
		System.out.println(answer);
	}
}
