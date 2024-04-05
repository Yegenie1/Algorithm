import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int kim = Integer.parseInt(st.nextToken());
		int yim = Integer.parseInt(st.nextToken());
		int count = 0;
		 
		while(kim != yim) {
			kim = kim/2 + kim%2;
			yim = yim/2 + yim%2;
			count++;
		}
		System.out.println(count);
		br.close();
	}
}