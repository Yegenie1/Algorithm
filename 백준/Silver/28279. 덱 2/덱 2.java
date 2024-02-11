import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> d = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());
			
			int demand = Integer.parseInt(st.nextToken());
			switch(demand) {
			case 1:
				int firstNum = Integer.parseInt(st.nextToken());
				d.addFirst(firstNum);
				break;
			case 2:
				int lastNum = Integer.parseInt(st.nextToken());
				d.addLast(lastNum);
				break;
			case 3:
				if (!d.isEmpty()) {
					sb.append(d.pollFirst()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			case 4:
				if (!d.isEmpty()) {
					sb.append(d.pollLast()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			case 5:
				sb.append(d.size()).append('\n');
				break;
			case 6:
				if (!d.isEmpty()) {
					sb.append(0).append('\n');
				}else {
					sb.append(1).append('\n');
				}
				break;
			case 7:
				if (!d.isEmpty()) {
					sb.append(d.peekFirst()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			case 8:
				if (!d.isEmpty()) {
					sb.append(d.peekLast()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);

		br.close();
	}
}