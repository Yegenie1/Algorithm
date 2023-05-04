package 프로그래머스;

public class 제곱수판별하기 {
	public static void main(String[] args) {
		int n = 144;
		int answer = 0;
		for (int i = 0; i < 10000000; i++) {
			if (i * i <= n) {
				if (i * i != n) {
					answer = 2;
				} else {
					answer = 1;
					break;
				}
			}
		}
		
//		if (n % Math.sqrt(n) == 0) {
//			answer = 1;
//        } else {
//        	answer = 2;
//        }
		
		
		System.out.println(answer);

	}

}
