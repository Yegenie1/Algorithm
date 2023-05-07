package 프로그래머스Lv1;

public class X만큼간격이있는N개의숫자 {

	public static void main(String[] args) {
		int x = 1000000;
		int n = 100;
		long[] answer = new long[n];
		for (int i = 0; i < n ; i++) {
			answer[i] = Long.valueOf(x)*(i+1);
		}
		for (long l : answer) {
			System.out.println(l);
		}
	}

}
