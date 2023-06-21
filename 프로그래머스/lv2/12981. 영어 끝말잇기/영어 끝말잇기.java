import java.util.Stack;

class Solution {
    public int[] solution(int n, String[] words) {
        
        int[] answer = {0,0};
		Stack<String> st = new Stack<>();
		for (int i = 0; i < words.length; i++) {
			
			if (!st.isEmpty() &&( st.contains(words[i])||st.peek().charAt(st.peek().length()-1)!= words[i].charAt(0))) {
				answer[0] = (st.size()+1)%n==0?n:(st.size()+1)%n;
				answer[1] = (int) Math.ceil((double)(i+1)/n);
                break;
				
			}
			st.push(words[i]);
			
		}
        return answer;
    }
}