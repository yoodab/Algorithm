import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double answer = 0;
		int min = 10000;

		// 드링크 수
		int n = sc.nextInt();

		// 드링크 양 
		double[] liter = new double[n];
		for (int i = 0; i < n; i++) {
			liter[i] = sc.nextInt();
		}
		// 오름차순 정렬
		Arrays.sort(liter);
		
		// 가장 큰 값 + 나머지값/2의 합
		answer+=liter[n-1];
		for (int i = n-2 ; i >= 0; i--) {
			answer+=liter[i]/2;
		}

		System.out.println(answer);
	}

}