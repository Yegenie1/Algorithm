import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] dp;
	static int code1 = 0;
	static int code2 = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		fib(n);
		fibonacci(n);
		sb.append(code1).append(' ').append(code2);
		System.out.println(sb);
		br.close();
	}
	public static int fib(int n) {
		if (n ==1 || n ==2) {
			code1++;
			return 1;
		}else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static int fibonacci(int n) {
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 3; i <= n; i++) {
			code2++;
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
}
