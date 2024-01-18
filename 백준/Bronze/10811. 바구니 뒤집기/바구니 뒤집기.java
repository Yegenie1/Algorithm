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
		
		int[] arr = new int [N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken())-1;
			int J = Integer.parseInt(st.nextToken())-1;
			
			while(I < J) {
				int temp = arr[I];
				arr[I++] = arr[J];
				arr[J--] = temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
