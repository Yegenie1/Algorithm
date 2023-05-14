package 프로그래머스Lv1;

public class 크기가작은부분문자열 {
	public static void main(String[] args) {
		String t = "10203";
		String p = "15";
		int answer = 0;
		long p2 = Long.parseLong(p);
		int psize = p.length();
		int tsize = t.length();
		StringBuilder sbt = new StringBuilder(t);
		for (int i = 0; i < tsize - (psize - 1); i++) {
			long check = Long.parseLong(sbt.substring(i, i + psize));
			if (check <= p2) {
				answer++;
			}
		}

		System.out.println(answer);

	}
}
