import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int time = 0;
        if (A < 0) {
            time = -A * C + D + B * E;
        } else {
            time = (B - A) * E;
        }
        System.out.println(time);
    }
}
