import java.util.Stack;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Stack<String> stack = new Stack<>();
		
		for (int i = 0; i < dic.length; i++) {
			stack.add(dic[i]);
			System.out.println(stack);
			for (int j = 0; j < spell.length; j++) {
				if (!stack.peek().contains(spell[j])) {
					stack.pop();
					break;
				}
			}
		}
		int answer = 0;
		if (stack.size()==0) {
			answer = 2;
		}else {
			answer = stack.size();
		}
        return answer;
    }
}