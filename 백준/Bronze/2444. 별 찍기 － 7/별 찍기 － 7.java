import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb;
		
		for (int i = 1; i <= N; i++) {
			sb = new StringBuilder();
			if (i <= N) {
				for (int j = 0; j < N-i; j++) {
					sb.append(" ");				
				}
				for (int j = 0; j < i*2-1; j++) {
					sb.append("*");
				}
			}
			System.out.println(sb);
		}
		for (int i = N-1; i >= 0; i--) {
			sb = new StringBuilder();
			for (int j = 0; j < N-i; j++) {
				sb.append(" ");				
			}
			for (int j = 0; j < i*2-1; j++) {
				sb.append("*");
			}
			System.out.println(sb);
		}
		br.close();
	}

}