import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(bino_coef(n, k));
		
		br.close();
	}
	public static int bino_coef(int n, int k) {
		if (k == 0 || n == k) {
			return 1;
		}
		return bino_coef(n-1,k) + bino_coef(n-1,k-1);
	}
}