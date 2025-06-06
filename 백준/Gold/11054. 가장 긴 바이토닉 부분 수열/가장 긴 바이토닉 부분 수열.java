import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dpLR = new int[N+1];
		for (int i = 1; i <= N; i++) {
			dpLR[i] = 1;
			for (int j = 1; j < i; j++) {
				if (arr[i] > arr[j]) {
					dpLR[i] = Math.max(dpLR[j] + 1, dpLR[i]);
				}
			}
		}
		int[] dpRL = new int[N+1];
		for (int i = N; i > 0; i--) {
			dpRL[i] = 1;
			for (int j = N; j > i; j--) {
				if (arr[i] > arr[j]) {
					dpRL[i] = Math.max(dpRL[j] + 1, dpRL[i]);					
				}
			}
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			max = Math.max(max, dpLR[i] + dpRL[i]);
		}
		System.out.println(max - 1);

		br.close();
	}
}