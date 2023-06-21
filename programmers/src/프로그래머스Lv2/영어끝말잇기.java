package 프로그래머스Lv2;

import java.util.Stack;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] answer = {0,0};
		Stack<String> st = new Stack<>();
		for (int i = 0; i < words.length; i++) {
			//스택이 비어있지 않고, 문자가 이미 있거나, 끝말잇기가 아닌경우 break
			if (!st.isEmpty() &&( st.contains(words[i])||st.peek().charAt(st.peek().length()-1)!= words[i].charAt(0))) {
				answer[0] = (st.size()+1)%n==0?n:(st.size()+1)%n;//몇번째 사람이 틀렸는지
				answer[1] = (int) Math.ceil((double)(i+1)/n);//틀린 사람이 몇 번째에 틀렸는지
				break;
			}
			st.push(words[i]);
			
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);

	}

}
