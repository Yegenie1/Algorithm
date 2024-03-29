import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> map = new HashMap<String, String>();

        for (String[] strings : db) {
            map.put(strings[0], strings[1]);
        }

        if (map.containsKey(id_pw[0])) {
            if (map.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }
}