import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
        int i = 0;
        while (len > 0) {
            int endIndex = Math.min(len, 10);
            String sub = s.substring(i * 10, i * 10 + endIndex);
            System.out.println(sub);
            len -= 10;
            i++;
        }
		br.close();
	}
}