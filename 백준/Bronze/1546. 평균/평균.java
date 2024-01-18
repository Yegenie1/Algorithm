import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double[] score = new double[N];
		double M = 0;
		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			double x = Double.parseDouble(st.nextToken());
			
			score[i] = x;
			M = Math.max(M, x);
		}
		
		for (int i = 0; i < score.length; i++) {
			score[i] = score[i]/M*100;
			sum += score[i];
		}
		
		System.out.println(sum/N);
		br.close();
	}

}