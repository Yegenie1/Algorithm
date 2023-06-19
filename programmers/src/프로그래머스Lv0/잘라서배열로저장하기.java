package 프로그래머스Lv0;

import java.util.ArrayList;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		String my_str = "111111111111111";
		int n = 6;
		ArrayList<String> list = new ArrayList<>();
		
		while (true) {
			if (my_str.length()<n) {
				if (my_str.length() == 0) {
					break;
				}else {
					list.add(my_str);
					break;
				}
			}
			String sub = my_str.substring(0, n);
			list.add(sub);
			my_str = my_str.replaceFirst(sub, "");
		}
		String[] answer = new String[list.size()];
		for (int j = 0; j < answer.length; j++) {
			answer[j] = list.get(j);
			System.out.println(answer[j]);
		}
		System.out.println(list);

	}

}
