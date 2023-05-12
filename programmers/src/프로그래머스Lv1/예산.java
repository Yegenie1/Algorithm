package 프로그래머스Lv1;

import java.util.Arrays;

public class 예산 {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
		int count = 0;
		
		Arrays.sort(d);
		
		for (int i = 0; i < d.length; i++) {
			answer += d[i];
			System.out.println(answer);
			
			if (answer>budget) {
				break;
			}else if (answer==budget) {
				count++;
				break;
			}
			count++;
		}
		System.out.println(count);

	}

}
