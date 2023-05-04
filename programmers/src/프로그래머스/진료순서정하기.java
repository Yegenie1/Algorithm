package 프로그래머스;

import java.util.Arrays;
import java.util.HashMap;

public class 진료순서정하기 {

	public static void main(String[] args) {
		int[] emergency = {3,76,24};
		int[] answer = emergency.clone();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Arrays.sort(answer);//{3,24,76}
		
		for (int i = 0 , j = answer.length; i < answer.length; i++,j--) {
			map.put(answer[i], j);//map(0,3)(1,2),(2,1)
		}
		int i = 0;
		for (int j : emergency) {
			answer[i] = map.get(j);//answer{3,1,2}
			i++;
		}
		for (int an : answer) {
			System.out.println(an);
			
		}
	}

}
