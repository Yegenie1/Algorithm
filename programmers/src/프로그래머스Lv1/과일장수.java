package 프로그래머스Lv1;

import java.util.Arrays;

public class 과일장수 {
	public static void main(String[] args) {
		int k = 4;
		int m = 3;
		int[] score = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		int answer = 0;
		//내림차순
//		Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
//		Arrays.sort(tmp, Comparator.reverseOrder());
//		//444/444/222/211
//		for (int i = m-1; i < tmp.length; i+=m) {
//				answer += m * tmp[i];
//			System.out.println(answer);
//		}
		
		//오름차순
		//112/222/444/444
		Arrays.sort(score);
		for (int i = score.length-m; i >= 0; i-=m) {
			answer += m*score[i];
		}
		
		System.out.println(answer);
		// m*score[i*k]

	}

}
