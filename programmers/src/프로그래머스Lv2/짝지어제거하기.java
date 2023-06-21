package 프로그래머스Lv2;

import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "caabbc";
		int answer = 0;
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (Character ch : arr) {
			if (!stack.isEmpty()&& stack.peek() ==ch) {
				stack.pop();
			}else {
				stack.push(ch);
			}
		}
		if (stack.isEmpty()) {
			answer = 1;
		}else {
			answer = 0;
		}
		System.out.println(answer);

	}

}
