package 프로그래머스Lv0;

import java.util.Arrays;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		String my_string="hello";
		int num1 = 1;
		int num2 = 2;
		String answer = "";
		String temp = "";
		String[] index = my_string.split("");
		temp = index[num1];
		index[num1] = index[num2];
		index[num2] = temp;
		for (int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
			answer += index[i];
		}
		System.out.println(answer.toString());
	}

}
