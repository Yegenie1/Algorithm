package 프로그래머스Lv0;

public class 문자열계산하기 {

	public static void main(String[] args) {
		String my_string ="3 + 4";
		int answer = 0;
	        String[] calNum = my_string.split(" ");
	        answer += Integer.parseInt(calNum[0]);
	        for(int i = 1 ; i < calNum.length ; i++){
	            if(i%2 != 0){
	                if(calNum[i].equals("+")){
	                    answer += Integer.parseInt(calNum[i+1]);
	                } else {
	                    answer -= Integer.parseInt(calNum[i+1]);
	                }
	            }

	        }
	    System.out.println(answer);
	        
		
	}
		 
}
