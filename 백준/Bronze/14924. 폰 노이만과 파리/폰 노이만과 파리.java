import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int T = sc.nextInt();
        int D = sc.nextInt();

        System.out.println(T*(D/(2*S)));
    }
}
