import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] ball = new int[N];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int I = Integer.parseInt(st.nextToken())-1;
			int J = Integer.parseInt(st.nextToken())-1;
			
			int tmp = ball[J];
			
			ball[J] = ball[I];
			ball[I] = tmp;
		}
		
		for (int i = 0; i < ball.length; i++) {
			bw.write(ball[i] + " ");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}