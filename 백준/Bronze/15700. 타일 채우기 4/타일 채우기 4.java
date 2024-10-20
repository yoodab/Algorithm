import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        
        long answer = (N * M) / 2;
        System.out.println(answer);
    }
}