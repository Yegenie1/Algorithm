import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int dp[] = new int[1000001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		int n = Integer.parseInt(br.readLine());
		System.out.println(dp(n));
		br.close();
	}
	public static int dp(int n) {
		if (dp[n] ==-1) {
			return dp[n] = (dp(n-1) + dp(n-2))%15746;
		}
		return dp[n];
	}
}