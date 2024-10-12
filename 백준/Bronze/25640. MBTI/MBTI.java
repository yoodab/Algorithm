import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String T = sc.nextLine();
        int N = sc.nextInt();
        sc.nextLine();
        int answer = 0;
        String F = "";
        
        for (int i = 1; i <= N; i++) {
            F = sc.nextLine();
            if(T.equals(F)){
                answer += 1;
            }
        }
        System.out.print(answer);
    }
}
