import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		long answer = 0;
		
		// 동전 개수
		int n = sc.nextInt();
		// 금액
		int cost = sc.nextInt();
		// 동전 종류
		Integer[] coin = new Integer[n];
		for(int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		

		for(int i = n-1; i > -1; i--) {
			if(cost>=coin[i]) {
				answer += cost/coin[i];
				cost %= coin[i];
			}
			
			
		}
		System.out.println(answer);
	}

}