package 프로그래머스;

public class 암호해독 {

	public static void main(String[] args) {
		String cipher ="dfjardstddetckdaccccdegk";
		int code = 4;
		String answer = "";
		String[] s = cipher.split("");
		for (int i = 0; i < s.length; i++) {
			if ((i+1) % code == 0) {
				answer += s[i];
			}
		}
		
//		for (int i = code; i <= cipher.length(); i = i + code) {
//            answer += cipher.substring(i - 1, i);
//        }
		
		System.out.println(answer);

	}

}
