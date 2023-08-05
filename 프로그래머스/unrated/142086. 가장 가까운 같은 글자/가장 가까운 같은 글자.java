import java.util.Stack;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		String[] sArr = s.split("");
		Stack<String> stack = new Stack<>();
		
		for (int i = 0; i < answer.length; i++) {
			if (!stack.contains(sArr[i])) {
				answer[i] = -1;
				stack.push(sArr[i]);
			}else {
				answer[i] = stack.size() - stack.lastIndexOf(sArr[i]);
				stack.push(sArr[i]);
			}
		}
        return answer;
    }
}