import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int total = A * 60 + B + C;
		
		int H = (total / 60) % 24;
		int M = total % 60;
		
		System.out.println(H + " " + M);			
		
		
	}

}