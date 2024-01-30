import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] arrAngle = new int[3];
        
        for (int i = 0; i < 3; i++) {
        	int angle = Integer.parseInt(br.readLine());
        	sum += angle;
        	arrAngle[i] = angle;
		}
        if (sum == 180) {
			if (arrAngle[0] == arrAngle[1] && arrAngle[1] == arrAngle[2]) {
				System.out.println("Equilateral");
			}else if (arrAngle[0] == arrAngle[1] || arrAngle[0] == arrAngle[2] || arrAngle[1] == arrAngle[2]) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
		}else {
			System.out.println("Error");
		}
        br.close();
	}
}