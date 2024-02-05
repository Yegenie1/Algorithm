import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
        	map.put(st.nextToken(), 0);
		}
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
        	String num = st.nextToken();
        	if (map.containsKey(num)) {
				map.remove(num);
			}else {
				map.put(num, 0);
			}
		}
        System.out.println(map.size());
        
        br.close();
    }
}