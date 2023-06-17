package 프로그래머스Lv0;

public class 세균증식 {

	public static void main(String[] args) {
		int n = 2;
		int t = 10;
		int answer = 0;
		answer = n * (int)Math.pow(2, t);
		//answer = n << t; 이진수로 풀기
		System.out.println(answer);

	}

}
