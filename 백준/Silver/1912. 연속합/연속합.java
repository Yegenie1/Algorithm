import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static Integer dp[];
	static int arr[];
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new Integer[n+1];
		StringTokenizer	st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		max = arr[0];
		recur(n-1);
		System.out.println(max);
		br.close();
	}
	public static int recur(int n) {
		if (dp[n] == null) {
			dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);
			max = Math.max(dp[n], max);
		}
		return dp[n];
	} 
}