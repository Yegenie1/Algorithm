import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        for (char ch : s.toCharArray()) {
            char current = ch;
            int count = 0;

            while (count < index) {
                current++; 
                if (current > 'z') current = 'a'; 
                
                if (!skipSet.contains(current)) {
                    count++; 
                }
            }

            sb.append(current);
        }
        answer = sb.toString();
        return answer;
    }
}