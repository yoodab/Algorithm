import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long answer = 0;
        while (true) {
            int bet = scanner.nextInt();  
            if (bet == -1) {
                break;  
            }
            answer += bet; 
        }

        System.out.println(answer);
    }
}