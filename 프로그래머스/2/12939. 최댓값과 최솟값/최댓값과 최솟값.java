import java.util.*;

class Solution {
    public String solution(String s) {
        List<Integer> sList = new ArrayList<>();
		String[] arr = s.split(" ");
        
		for (int i = 0; i < arr.length; i++) {
			sList.add(Integer.parseInt(arr[i]));
		}
        
		Collections.sort(sList);
		int min = sList.get(0);
		int max = sList.get(sList.size()-1);
		String answer = min + " " + max;
        return answer;
    }
}