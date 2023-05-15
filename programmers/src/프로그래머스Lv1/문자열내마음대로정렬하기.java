package 프로그래머스Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열내마음대로정렬하기 {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n =1;
		String[] answer = new String[strings.length];
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < answer.length; i++) {
			list.add(strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(list);
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).substring(1);
					
		}
		
		for (String string : answer) {
			System.out.println(string);
		}
		
		
		
	}

}
