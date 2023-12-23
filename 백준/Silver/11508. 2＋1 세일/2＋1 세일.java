import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		long answer = 0;
		
		// 개수
		int n = sc.nextInt();
		
		// 가격
		Integer[] cost = new Integer[n];
		for(int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}
		
		// 내림차순
		Arrays.sort(cost,Collections.reverseOrder());

		// 가격이 큰 순서로 3의 배수 번째 물건은 계산 안함
		for (int i = 0; i < n; i++) {
			if((i+1)%3==0) {
				continue;
			}
			answer += cost[i];
		}
		

		System.out.println(answer);
	}

}