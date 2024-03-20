
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i = 1;
		while(true) {
			int n0 = Integer.parseInt(br.readLine());
			if (n0 == 0) {
				break;
			}
			int n1 = n0 * 3;
			int n2 = (n1+1)/2;
			if (n1 % 2 == 0) {
				n2 = n1/2;
			}
			int n3 = 3*n2;
			int n4 = n3/9;
			sb.append(i).append(". ").append(n1%2==0?"even ":"odd ").append(n4).append('\n');
			i++;
		}
		System.out.println(sb);
		br.close();
	}
}