package 프로그래머스Lv2;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		List<Integer> list = new ArrayList<>();
		int[] works = new int[progresses.length];
		for (int i = 0; i < works.length; i++) {
			works[i] = (100 - progresses[i])/speeds[i];
			if ((100 - progresses[i])%speeds[i] != 0) {
				works[i] += 1;
			}
		}
		
		int x = works[0];
		int count = 1;
		for (int i = 1; i < works.length; i++) {
			if (x >= works[i]) {
				count += 1;
			}else {
				list.add(count);
				count = 1;//count 초기화
				x = works[i];
			}
		}
		list.add(count);
		
		int[] answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
		

	}

}
