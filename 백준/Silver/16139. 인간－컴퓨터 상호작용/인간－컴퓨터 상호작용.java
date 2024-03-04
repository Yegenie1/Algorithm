import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int[][] arr = new int[s.length()+1][26];
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < 26; j++) {
				arr[i][j] = arr[i-1][j];
			}
			arr[i][s.charAt(i-1) - 'a'] += 1;
		}
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int c = st.nextToken().charAt(0) - 'a';
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			sb.append(arr[r+1][c] - arr[l][c]).append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}