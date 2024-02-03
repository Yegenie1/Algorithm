import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
			arr[i] = Integer.parseInt(Character.toString(s.charAt(i)));
		}
        for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]< arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			sb.append(arr[i]);
		}
        System.out.println(sb);
        br.close();
    
    }
}