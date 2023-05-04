package 프로그래머스;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		String phone_number = "027778888";
		String answer = "";
		
		for (int i = 0; i < phone_number.length()-4; i++) {
			answer +="*";
		}
		answer += phone_number.substring(phone_number.length()-4);
		//평균 2.00ms
//		char[] ch = phone_number.toCharArray();
//	     for(int i = 0; i < ch.length - 4; i ++){
//	         ch[i] = '*';
//	     }
//	    answer = String.valueOf(ch);
		//평균 0.02ms
	    //처음에 배열로 바꿔서 풀 생각을 했으나 다시 문자열로 받는걸 생각못함
	    //그래서 풀이를 보고 valueOf() : ()안의 해당 객체를 String으로 변환시키는 역할이 있다는 것을 다시 알게됨
		System.out.println(answer);

	}

}
