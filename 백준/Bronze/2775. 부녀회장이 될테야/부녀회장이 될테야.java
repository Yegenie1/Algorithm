import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[][] dp = new int[15][15];
		for (int i = 1; i < dp.length; i++) {
			dp[0][i] = i;
			dp[i][1] = 1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp.length; j++) {
				dp[i][j] = dp[i-1][j]+dp[i][j-1];
			}
		}
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[k][n]).append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}
