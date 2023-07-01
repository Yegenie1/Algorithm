class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(" ", -1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length; i++) {
			String[] alpha = word[i].split("");
			for (int j = 0; j < alpha.length; j++) {
				if (j % 2 == 0) {
					sb.append(alpha[j].toUpperCase());
				}else {
					sb.append(alpha[j].toLowerCase());
				}
			}
			sb.append(" ");
		}
		sb.deleteCharAt(s.length());
		answer = sb.toString();
        return answer;
    }
}