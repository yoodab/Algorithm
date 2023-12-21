import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String in = sc.next();
		String answer = "";
		int xCount = 0;
		
		// 이어지는 X의 개수를 문자열로 적기
		for (int i = 0; i < in.length(); i++) {
			if (String.valueOf(in.charAt(i)).equals("X")) {
				xCount++;
				answer += xCount;
				if (xCount == 4) {
					xCount = 0;
				}
			} else {
				answer += ".";
				xCount = 0;
			}

		}

		// 1234 = AAAA로 변환
		answer = answer.replace("1234", "AAAA");
		// 12 = BB로 변환
        answer = answer.replace("12", "BB");
		
		// 1 이나 3이 있으면 X를 A나 B로 변환불가 -1 리턴
		if (answer.contains("1") || answer.contains("3")) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
		}

	}

}