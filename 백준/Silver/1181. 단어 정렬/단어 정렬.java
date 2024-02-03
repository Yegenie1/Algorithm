import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
        Arrays.sort(arr, (s1, s2) ->{
        	if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			}else {
				return s1.length() - s2.length();
			}
        });
        
        sb.append(arr[0]).append('\n');
        
        for (int i = 1; i < arr.length; i++) {
			if (!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');
			}
		}
        System.out.println(sb);
    }
}