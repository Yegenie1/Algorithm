import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String str = br.readLine();
			str = str.toLowerCase();
			int count = 0;
			
			if (str.equals("#"))break;
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
					count++;
				}
			}
			System.out.println(count);
		}
		br.close();
	}
}

