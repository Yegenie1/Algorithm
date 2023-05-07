package 프로그래머스Lv0;

public class 가위바위보 {

	public static void main(String[] args) {
		String rsp = "205";
		String[] arr =rsp.split("");
		char[] answer = new char[rsp.length()];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("2")) {
				answer[i] = '0';
			}else if (arr[i].equals("0")) {
				answer[i] = '5';
			}else {
				answer[i] = '2';
			}
		}
		String answer2 = String.valueOf(answer); 
		System.out.println(answer2);
	}

}
