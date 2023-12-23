import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 손님은 팁을 생각하고 옴
		// 실제로 주는 팁 = 생각해온 팁 - (받은 등수 - 1)
		// 가장 큰 팁을 받으려면 팁이 큰사람부터 줘야함
		long answer = 0;
		
		// 인원
		int N = sc.nextInt();
		
		// 팁
		Integer[] tip = new Integer[N];
		for(int i = 0; i<N; i++) {
			tip[i] = sc.nextInt();
		}
		// 내림차순
		Arrays.sort(tip,Collections.reverseOrder());
		
		// 실제로 주는 팁 = 생각해온 팁 - (받은 등수 - 1)
		// 받은 등수는 i+1
		for(int i=0;i<N;i++) {
			long currentTip = tip[i]-i;
			if(currentTip>0) {
				answer+=currentTip;
			}
			
		}
		
		System.out.println(answer);
	}

}