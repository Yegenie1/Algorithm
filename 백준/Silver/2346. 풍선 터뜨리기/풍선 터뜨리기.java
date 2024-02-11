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
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			d.offer(i+1);
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		sb.append(d.pollFirst() + " ");
		int paper = 0;
		for (int i = 0; i < n-1; i++) {
			if (arr[paper] > 0) {
				for (int j = 0; j < arr[paper]-1; j++) {
					d.offerLast(d.pollFirst());
				}
				paper = d.peekFirst()-1;
				sb.append(d.pollFirst() + " ");
			}else if (arr[paper] < 0) {
				for (int j = 0; j > arr[paper]+1; j--) {
					d.offerFirst(d.pollLast());
				}
				paper = d.peekLast()-1;
				sb.append(d.pollLast() + " ");
			}
		}
		System.out.println(sb);

		br.close();
	}
}