class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char alpha = s.charAt(i);
			
			if (Character.isLowerCase(alpha)) {
				alpha = (char)((alpha - 'a' + n) % 26 + 'a');
			}else if (Character.isUpperCase(alpha)) {
				alpha = (char)((alpha - 'A' + n) % 26 + 'A');
			}
			sb.append(alpha);
		}
		String answer = sb.toString();
        return answer;
    }
}