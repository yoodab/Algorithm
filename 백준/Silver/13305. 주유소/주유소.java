import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long answer = 0;
		

		// 마을 수
		int n = sc.nextInt();

		long[] distance = new long[n - 1];
		long[] cost = new long[n];

		for (int i = 0; i < n-1; i++) {
			distance[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextLong();
		}
		long min = cost[0];
		// 거리*금액을 더함
		// 금액을 이전 마을들과 비교해 가장 싼 마을에서 기름을 삼
		for(int i =0; i<n-1;i++) {
			if(min>cost[i]) {
				min = cost[i];
			}
			answer+=min*distance[i];	
		}
		

		System.out.println(answer);
	}

}