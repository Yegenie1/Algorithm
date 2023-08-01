class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            boolean found = true;
            while (found) {
                found = false;
                for (int j = 0; j < speak.length; j++) {
                    if (babbling[i].startsWith(speak[j])) {
                        babbling[i] = babbling[i].replace(speak[j], "");
                        found = true;
                        break; 
                    }
                }
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].equals("")) {
                answer++;
            }
        }
        return answer;
    }
}