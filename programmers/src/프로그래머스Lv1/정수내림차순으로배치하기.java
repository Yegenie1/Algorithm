package 프로그래머스Lv1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long answer = 0;
        long n = 118372;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        //Arrays.sort(list,Collections.reverseOrder());
        //이렇게 쓰면 reverse()안써도 됨 근데 list가 기본자료형이면 안됨
        StringBuilder rev = new StringBuilder();
        for (String str : list) {
			rev.append(str);
		}
        answer = Long.parseLong(rev.reverse().toString());
        System.out.println(answer);
	}

}
