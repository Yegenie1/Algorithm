import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] number = new int[9];
		
		for (int i = 0; i < 9; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		int max = number[0];
		int n = 1;
		for (int i = 1; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
				n = i+1;
			}
		}
		System.out.println(max);
		System.out.println(n);
		br.close();
	}

}
