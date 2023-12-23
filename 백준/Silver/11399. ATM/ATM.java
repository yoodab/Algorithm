import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		long answer = 0;
		
		// 인원
		int n = sc.nextInt();
		
        // 시간
		int[] time = new int[n];
		for(int i = 0; i < n; i++) {
			time[i] = sc.nextInt();
		}
		
		// 오름차순
		Arrays.sort(time);
        
        // n번째 사람이 걸린 시간 = 이전에 걸린 시간 + 지금 시간
        // 이전에 걸린 시간 = 이전 사람들의 시간 합
		int preTime =0;
		for (int i = 0; i < n; i++) {
			answer += preTime+time[i];
			preTime += time[i];
		}
		System.out.println(answer);
	}

}