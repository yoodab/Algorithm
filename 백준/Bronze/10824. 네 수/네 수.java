import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        int lenB = Long.toString(B).length();
        int lenD = Long.toString(D).length();

        long num1 = A * (long) Math.pow(10, lenB) + B;
        long num2 = C * (long) Math.pow(10, lenD) + D;

        System.out.println(num1 + num2);

    }
}


