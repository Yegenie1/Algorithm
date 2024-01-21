import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int k = (int) Math.round((double)s.length()/2);
		int count = 0;
		for (int i = 1; i <= k; i++) {
			if (s.charAt(i-1) == s.charAt(s.length()-i)) {
				count++;
				continue;
			}else {
				System.out.println(0);
				break;
			}
		}
		if (count == k) {
			System.out.println(1);
		}
		
		br.close();
	}

}