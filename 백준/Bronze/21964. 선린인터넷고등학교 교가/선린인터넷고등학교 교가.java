import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String s = scanner.next();
    
        System.out.println(s.substring(n - 5));
    }
}