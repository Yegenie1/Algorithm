package 프로그래머스Lv0;

public class 삼육구게임 {

	public static void main(String[] args) {
		int order = 3;
		int answer = 0;
		String s = Integer.toString(order);
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.charAt(0));
		char[] array = new char[sb.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = sb.charAt(i);
			if (array[i] == '3'||array[i] == '6'||array[i] == '9') {
				answer++;
			}
		}
		
//		while(order != 0)
//        {
//            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9)
//            {
//                count++;
//            }
//             order = order/10;
//        }
		
		
		System.out.println(answer);

	}

}
