package 프로그래머스Lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 귤고르기 {

	public static void main(String[] args) {
		int k = 6;
		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };
		int answer = 0;

		HashMap<Integer, Integer> tanSize = new HashMap<>();
		// 사이즈별로 정리
		for (int i = 0; i < tangerine.length; i++) {
			tanSize.put(tangerine[i], tanSize.getOrDefault(tangerine[i], 0) + 1);
		}
		// value만 꺼내서 list에 담기
		List<Integer> list = new ArrayList<Integer>(tanSize.values());
		
		//내림차순
		Collections.sort(list, Collections.reverseOrder());
		
		int k2 = 0;
		for (int j = 0; j < list.size(); j++) {
			k2 += list.get(j);
			answer++;
			if (k2 >= k) {
				break;
			}
			
		}
		System.out.println(tanSize);
		System.out.println(answer);

	}

}
