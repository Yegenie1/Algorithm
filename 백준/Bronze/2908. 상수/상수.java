import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder A = new StringBuilder(st.nextToken());
		StringBuilder B = new StringBuilder(st.nextToken());
		
		int revA = Integer.parseInt(A.reverse().toString());
		int revB = Integer.parseInt(B.reverse().toString());
		if (revA < revB) {
			System.out.println(revB);
		}else if(revA > revB){
			System.out.println(revA);
		}
		br.close();
	}

}