import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int element = Integer.parseInt(st.nextToken());
				A[i][j] = element;
			}
		}
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int element = Integer.parseInt(st.nextToken());
				B[i][j] = element;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(A[i][j] + B[i][j] + " ");
			}
			System.out.println();
		}
		br.close();
	}

}
