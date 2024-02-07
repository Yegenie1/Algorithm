import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
	
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}

		for (int i = 0; i < stack.size(); i++) {
			sum += stack.get(i);
		}
		System.out.println(sum);
		br.close();
	}
}