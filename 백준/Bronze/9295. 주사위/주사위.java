import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수 T를 입력받음
        int T = sc.nextInt();
        
        // T개의 테스트 케이스를 처리
        for (int i = 1; i <= T; i++) {
            // 각 테스트 케이스마다 주사위 두 번 던진 결과를 입력받음
            int die1 = sc.nextInt();
            int die2 = sc.nextInt();
            
            // 출력 형식에 맞게 결과 출력
            System.out.println("Case " + i + ": " + (die1 + die2));
        }
    }
}
