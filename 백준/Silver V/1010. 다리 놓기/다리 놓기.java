import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		dp = new int[30][30];
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			sb.append(combi(m,n)).append('\n');
		}
		System.out.println(sb);
		
		br.close();
	}
	public static int combi(int n, int r) {
		if (dp[n][r] > 0) {
			return dp[n][r];
		}
		
		if (n == r|| r == 0) {
			return dp[n][r] = 1;
		}
		
		return dp[n][r] = combi(n-1,r-1)+combi(n-1,r);
	}
}