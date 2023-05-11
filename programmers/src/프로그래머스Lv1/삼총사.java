package 프로그래머스Lv1;

public class 삼총사 {

	public static void main(String[] args) {
		int[] number = {-2, 3, 0, 2, -5};
		int answer = 0;
		for (int i = 0; i < number.length-2; i++) {
			for (int j = i+1; j < number.length-1; j++) {
				for (int j2 = j+1; j2 < number.length; j2++) {
					
					if (number[i]+number[j]+number[j2]==0) {
						answer+=1;
					}
				}
			}
		}
		System.out.println(answer);

	}

}
