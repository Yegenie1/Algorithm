package 프로그래머스Lv2;

import java.util.HashMap;

public class 의상 {

	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		int answer = 1;

		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			String type = clothes[i][1];
			map.put(type, map.getOrDefault(type, 0) + 1);//옷 종류에 따른 개수 구하기
		}
		//answer에 안입었을 경우를 합쳐서 곱해주기 그래서 초기값을 1로 지정
		for (String key : map.keySet()) {
			answer *= (map.get(key) + 1);
		}
		answer -= 1;//아무것도 안입었을때 빼주기
		System.out.println(answer);
	}

}
