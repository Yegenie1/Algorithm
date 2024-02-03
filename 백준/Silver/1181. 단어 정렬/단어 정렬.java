import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < n; i++) {
        	set.add(br.readLine());
		}
        String[] arr = new String[set.size()];
        set.toArray(arr);
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].length() > arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}else if (arr[i].length() == arr[j].length()) {
					if (dictionary(arr[i], arr[j]).equals(arr[i])) {
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			sb.append(arr[i]).append('\n');
		}
        System.out.println(sb);
        br.close();
    
    }
    public static String dictionary(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) > b.charAt(i)) {
				return a;
			}else if(a.charAt(i) == b.charAt(i)) {
				continue;
			}else {
				return b;
			}
		}
		return b;
	}
}