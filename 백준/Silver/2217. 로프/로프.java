import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] rope = new int[N];
		int answer = 0;
		for(int i = 0; i<N; i++) {
			rope[i] = sc.nextInt();
		}
		
		// 작은거 순으로 정렬
		Arrays.sort(rope);
		// 제일 작은 줄 * 줄 개수
		// 작은 줄을 제외하며 무게를 확인함
		for(int i = 0; i<rope.length; i++) {
			int now = rope[i]*(N-i);
			if(answer<now) {
				answer = now;
			}
		}
		System.out.println(answer);
	}

}