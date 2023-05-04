package 프로그래머스;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		int answer = 0;
		String my_string = "aAb1B2cC34oOp";
		
		String[] s = my_string.split("");
		for (int i = 0; i < s.length; i++) {
			if (s[i].matches("-?\\d+")) {
				int sint = Integer.parseInt(s[i]);
				answer += sint;
			}
		}
		System.out.println(answer);

		

	}

}
