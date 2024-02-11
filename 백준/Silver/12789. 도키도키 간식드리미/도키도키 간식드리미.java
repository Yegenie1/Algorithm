import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int order = 1;
		int[] line = new int[n];
		for (int i = 0; i < n; i++) {
			line[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < line.length; i++) {
			int num = line[i];
			if (num == order) {
				order++;
			}else {
				if (!stack.isEmpty() && stack.peek() == order) {
					stack.pop();
					order++;
					i--;
				}else {
					stack.push(num);					
				}
			}
		}
		while (!stack.isEmpty()) {
			if (stack.peek() == order) {
				stack.pop();
				order++;
			} else {
				break;
			}
		}
		
		if (stack.isEmpty()) {
			System.out.println("Nice");
		}else {
			System.out.println("Sad");
		}
		
		br.close();
	}
}