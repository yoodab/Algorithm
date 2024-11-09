import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            int a = sc.nextInt();
            sum = sum - a;
        }

        System.out.println(sum);
    }
}