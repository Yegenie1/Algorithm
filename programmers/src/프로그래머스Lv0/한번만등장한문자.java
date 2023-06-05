package 프로그래머스Lv0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		String answer = "";
	       
        HashSet<String> set = new HashSet<>();
        String[] s2 = s.split("");
        for(String x : s2){
            set.add(x);
        }
        
        Object[] set2 = set.toArray();
        Arrays.sort(set2);
        List<String> list = Arrays.asList(s2);
        for (Object x : set2) {
			if (Collections.frequency(list, x) == 1) {
				answer += x;
			}
		}
        System.out.println(answer);
	}

}
