import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		Arrays.sort(num);
		
		int mode = 10000;
		int modeMax = 0;
		boolean flag = false;
		
		for (int i = 0; i < n; i++) {
			int jump = 0;
			int count = 1;
			int iValue = num[i];
			for (int j = i+1; j < n; j++) {
				if (iValue != num[j]) {
					break;
				}
				count++;
				jump++;
				
			}
			if (count > modeMax) {
				modeMax = count;
				mode = iValue;
				flag = true;
			}else if (count == modeMax && flag == true) {
				mode = iValue;
				flag = false;
			}
			i += jump;
		}
		
		sb.append(Math.round(sum/n)).append('\n');
		sb.append(num[n/2]).append('\n');
		sb.append(mode).append('\n');
		sb.append(num[n-1] - num[0]).append('\n');
		System.out.println(sb);
		br.close();
	}
}
