package 프로그래머스;

import java.util.HashMap;

public class 외계행성의나이 {

	public static void main(String[] args) {
		int age = 23;
		String answer = "";
		HashMap<Character, String> map = new HashMap<Character, String>();
		map.put('0', "a");
		map.put('1', "b");
		map.put('2', "c");
		map.put('3', "d");
		map.put('4', "e");
		map.put('5', "f");
		map.put('6', "g");
		map.put('7', "h");
		map.put('8', "i");
		map.put('9', "j");
		String age2 = String.valueOf(age);
		 for (int i = 0; i < age2.length(); i++) {
		        char c = age2.charAt(i);
		        if (map.containsKey(c)) {
		            answer += map.get(c);
		        }
		    }
		 
//		 String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};
//
//	        while(age>0){
//	            answer = alpha[age % 10] + answer;
//	            age /= 10;
//	        }
		System.out.println(answer);

	}

}
