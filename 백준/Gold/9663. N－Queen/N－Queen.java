import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] arr;
	static int n;
	static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dfs(0);
		System.out.println(count);
		br.close();
	}
	public static void dfs(int depth) {
		if (depth == n) {
			count++;
			return;
		}
		for (int i = 0; i < n; i++) {
			arr[depth] = i;
			if (possibility(depth)) {
				dfs(depth + 1);
			}
		}
	}
	public static boolean possibility(int col) {
		for (int i = 0; i < col; i++) {
			if (arr[col] == arr[i]) {
				return false;
			}else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}
	
}