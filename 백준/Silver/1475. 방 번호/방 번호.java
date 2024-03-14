import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[10];
		for (int i = 0; i < s.length(); i++) {
			int num = Character.getNumericValue(s.charAt(i));
			if (num == 6) {
				arr[9]++;
			}else {
				arr[num]++;
			}
		}
		if (arr[9] % 2 == 1) {
			arr[9] = arr[9]/2+1;
		}else {
			arr[9] = arr[9]/2;
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
		br.close();
	}
}