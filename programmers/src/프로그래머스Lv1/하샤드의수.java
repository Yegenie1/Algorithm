package 프로그래머스Lv1;

public class 하샤드의수 {

	public static void main(String[] args) {
		boolean answer = true;
//		String [] tmp = String.valueOf(x).split("");
//	    int sum=0;
//	        for(String s:tmp) {
//	            sum+=Integer.parseInt(s);
//	        }

		int x = 11;
        int sum = 0;
        int num = x;
        while(num != 0){
			sum += num%10;
			num /= 10;
		}
        if (x % sum ==0) {
			answer = true;
		}else {
			answer = false;
		}
        System.out.println(answer);

	}

}
