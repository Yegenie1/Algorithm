import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		boolean err = false;
		int j = 1;
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			for ( ; j <= value; j++) {
				stack.push(j);
				sb.append("+").append('\n');
			}
			if (stack.peek() == value) {
				stack.pop();
				sb.append("-").append('\n');
			}else {
				err = true;
				break;
			}
		}
		if (err) {
			System.out.println("NO");
		}else {
			System.out.println(sb);
		}
		br.close();
	}
}