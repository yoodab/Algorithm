import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s = 2;
        for (int i = 1; i <= N; i++) {
            s = s+s-1;
        }

        System.out.println(s*s);
    }
}


