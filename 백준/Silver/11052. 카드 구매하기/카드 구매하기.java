import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] dp;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	
		}
		for (int i = 0; i < n+1; i++) {
			for (int j = 0; j < i+1; j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+arr[j]);
			}
		}
		System.out.println(dp[n]);
		br.close();
	}
}
