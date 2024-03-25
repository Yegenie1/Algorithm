import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int last = 0;
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String demand = st.nextToken();

			switch (demand) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				q.offer(num);
				last = num;
				break;
			case "pop":
				if (!q.isEmpty()) {
					sb.append(q.poll()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			case "size":
				sb.append(q.size()).append('\n');
				break;
			case "empty":
				if (q.isEmpty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				break;
			case "front":
				if (!q.isEmpty()) {
					sb.append(q.peek()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			case "back":
				if (!q.isEmpty()) {
					sb.append(last).append('\n');
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