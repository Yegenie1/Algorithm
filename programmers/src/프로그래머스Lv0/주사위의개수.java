package 프로그래머스Lv0;

public class 주사위의개수 {

	public static void main(String[] args) {
		int[] box = {10, 8, 6};
		int n = 3;
		int answer = (box[0]/n) *(box[1]/n) *(box[2]/n);
		System.out.println(answer);

	}

}
