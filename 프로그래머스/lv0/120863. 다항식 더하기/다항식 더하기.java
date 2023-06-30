class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
		int c = 0;
		StringBuilder sb = new StringBuilder();
		String[] arr = polynomial.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("x")) {
				if (arr[i].length()>1) {
					int frontx = Integer.parseInt(arr[i].substring(0, arr[i].length()-1));
					x += frontx;
					System.out.println(frontx);
				}else {
					x++;
				}
			}else if(!arr[i].equals("+")){
				c += Integer.parseInt(arr[i]);
			}
		}
		if (x != 0 && x != 1) {
			sb.append(x);
			sb.append("x");
		}else if(x == 1){
			sb.append("x");
		}
		
		if (c != 0 && x != 0) {
			sb.append(" + ");
			sb.append(c);
		}else if(x == 0) {
			sb.append(c);
		}
		answer = sb.toString();
        return answer;
    }
}