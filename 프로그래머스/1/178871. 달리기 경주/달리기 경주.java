import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> score = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            score.put(players[i], i);
        }

        for (String name : callings) {
            int idx = score.get(name);
            String front = players[idx - 1]; 

            players[idx - 1] = name;
            players[idx] = front;

            score.put(name, idx - 1);
            score.put(front, idx);
        
        }
        answer = players;
        return answer;
    }
}