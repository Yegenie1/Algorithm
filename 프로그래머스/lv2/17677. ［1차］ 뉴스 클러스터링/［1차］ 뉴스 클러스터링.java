import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		for (int i = 0; i < str1.length()-1; i++) {
			String substring = str1.toUpperCase().substring(i, i + 2);
		    if (substring.matches("[A-Z]{2}")) { 
		    	list1.add(substring);
		    }
		}
		for (int i = 0; i < str2.length()-1; i++) {
			String substring = str2.toUpperCase().substring(i, i + 2);
		    if (substring.matches("[A-Z]{2}")) { 
		    	list2.add(substring);
		    }
		}
		
		List<String> union = new ArrayList<String>();
		List<String> intersection = new ArrayList<String>();
		for (String s : list1) {
			 if(list2.remove(s)){
				 intersection.add(s);
	         }
	         union.add(s);
		}
		
		for(String s : list2){
	          union.add(s);
	    }
        int j = 0;
        if (union.size() == 0) {
			answer = 65536;
		}else{
            answer = 65536 * intersection.size() / union.size();
        }
		
        return answer;
    }
}