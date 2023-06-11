package 프로그래머스Lv2;

import java.util.Stack;

public class 괄호회전하기 {

	public static void main(String[] args) {
		String s = "}]()[{";
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder(s);
			//한글자씩 회전
			String subString = sb.substring(0,i);
			sb.delete(0, i);
			sb.append(subString);
			if (isString(sb)) {
				answer +=1;
			}
		}
		System.out.println(answer);
	}
	
	public static boolean isString(StringBuilder sb) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < sb.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(sb.charAt(i));
			}else {
				if (sb.charAt(i)==']') {
					if (stack.peek()=='[') {
						stack.pop();//맞으면 지워서 stack을 비우게 만들기
					}else {
						stack.push(sb.charAt(i));//아니면 스택 쌓기
					}
				}else if (sb.charAt(i)==')') {
					if (stack.peek()=='(') {
						stack.pop();
					}else {
						stack.push(sb.charAt(i));
					}
				}else if (sb.charAt(i)=='}') {
					if (stack.peek()=='{') {
						stack.pop();
					}else {
						stack.push(sb.charAt(i));
					}
				}else {
					stack.push(sb.charAt(i));
				}
			}
		}
		if (stack.isEmpty()) {
			return true;//스택이 비어 있으면 바른 괄호니까 true			
		}else {
			return false;//스택에 뭔가 있으면 틀린 괄호니까 false
		}
		
	}

}
