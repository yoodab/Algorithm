import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t = 0; t < 3; t++) {
            int N = sc.nextInt();
            BigInteger sum = new BigInteger("0");

            for (int i = 0; i < N; i++) {
                sum = sum.add(sc.nextBigInteger());
            }

            if (sum.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (sum.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}