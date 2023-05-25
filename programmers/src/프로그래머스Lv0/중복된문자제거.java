package 프로그래머스Lv0;

public class 중복된문자제거 {

	public static void main(String[] args) {
		String my_string ="people";
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i)) == i) answer += my_string.charAt(i);
		}
		System.out.println(answer);

	}

}
