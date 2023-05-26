package 프로그래머스Lv0;

public class 컨트롤제트 {
public static void main(String[] args) {
	String s ="1 2 Z 3";
	int answer = 0;
	String[] s2 = s.split(" ");
	for (int i = 0; i < s2.length; i++) {
		
		if (!s2[i].equals("Z")) {
			answer += Integer.parseInt(s2[i]);
		}else {
			answer -= Integer.parseInt(s2[i-1]);
		}
		
	}
	
	System.out.println(answer);
}
}
