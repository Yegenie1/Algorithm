package 프로그래머스Lv0;

public class 모스부호1 {

	public static void main(String[] args) {
		String letter = ".... . .-.. .-.. ---";
		String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		String[] letter2 = letter.split(" ");
		String[] answer = new String[letter2.length];
		
		for (int i = 0; i < letter2.length; i++) {
			for (int j = 0; j < mos.length; j++) {
				if (mos[j].equals(letter2[i])) {
					answer[i]=alpha[j];
				}
			}
		}
		String answer2 = String.join("", answer);
        System.out.println(answer2);

	}

}
