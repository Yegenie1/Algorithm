package 프로그래머스Lv1;

import java.util.HashMap;

public class 추억점수 {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may"},{"may", "kein", "deny"}, {"kon","coni"}};
		int answer[] = new int[photo.length];
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				if (map.containsKey(photo[i][j])) {
					answer[i] += map.get(photo[i][j]);
				}
			}

		}
		System.out.println(photo[1].length);
		for (int i : answer) {
			System.out.println(i);
		}
	}

}
