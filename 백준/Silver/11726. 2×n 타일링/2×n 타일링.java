import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new Integer[1001];
		dp[1] = 1;
		dp[2] = 2;
		System.out.println(tiling(n));
		br.close();
	}
	public static int tiling(int n) {
		if (dp[n] != null) {
			return dp[n];
		}
		dp[n] = (tiling(n-1) + tiling(n-2)) % 10007;
		return dp[n];
	}
}