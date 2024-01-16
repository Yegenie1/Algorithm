import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			sb.append(" ");
		}
		
		for (int j = T-1; j >= 0; j--) {
			sb.replace(j, j+1, "*");
			System.out.println(sb);
		}
		br.close();
		
	}

}