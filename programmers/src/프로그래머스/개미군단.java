package 프로그래머스;

public class 개미군단 {

	public static void main(String[] args) {
		int hp = 23;
		int answer = 0;
		//hp가 5로 나눈 몫이 있으면 answer에 넣고 
		//나머지를 3으로 나눠서 몫이 있으면 answer에 더하고 
		//또 나머지가 있으면 answer에 더하기
		answer = hp / 5;
		if (hp % 5 > 0) {
			answer += hp % 5 / 3;
		}
		if (hp % 5 % 3 > 0) {
			answer += hp % 5 % 3;
		}
        System.out.println(answer);

	}

}
