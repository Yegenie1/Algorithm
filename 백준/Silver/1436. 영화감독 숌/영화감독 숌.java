import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "666";
        int count = 0;
        for (int i = 666; i < 666666666; i++) {
        	if (Integer.toString(i).contains(s)) {
				count++;
				if (count == n) {
					System.out.println(i);
					break;
				}
			}
		}
        br.close();
    
    }
}