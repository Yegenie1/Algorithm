import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < n; i++) {
        	String num = st.nextToken();
			map.put(num, map.getOrDefault(num, 0)+1);
		}
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
        	String num = st.nextToken();
        	if (map.get(num) != null) {
        		sb.append(map.get(num)).append(" ");				
			}else {
				sb.append(0).append(" ");								
			}
		}
        System.out.println(sb);
        
        br.close();
    }
}