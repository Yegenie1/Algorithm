package 프로그래머스Lv0;

public class 영어가싫어요 {

	public static void main(String[] args) {
		String numbers="onetwothreefourfivesixseveneightnine";
		String[] matchNumbers = {
                "zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};

        for (int i = 0; i < matchNumbers.length; i++) {
            numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
        }
        Long answer =Long.parseLong(numbers);
        System.out.println(answer);

	}

}
