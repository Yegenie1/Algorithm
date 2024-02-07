import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack<Character>();
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j)=='(') {
					stack.push(s.charAt(j));					
				}else {
					if (!stack.isEmpty()) {
						stack.pop();						
					}else {
						stack.push(s.charAt(j));	
						break;
					}
				}
			}
			if (stack.size() == 0 ) {
				sb.append("YES").append('\n');
			}else {
				sb.append("NO").append('\n');
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}