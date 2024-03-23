import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		long[] dp = new long[1000002];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i < dp.length; i++) {
			dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000009;
		}
		for (int i = 0; i < T; i++) {
			System.out.println(dp[arr[i]]);
		}
		br.close();
	}
}