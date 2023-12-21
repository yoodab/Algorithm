import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int coin = 0;
      // 5원
      if (N > 4) {
         coin += N / 5;
         N %= 5;
      }
      // 2원
      if (N % 2 == 0) {
         coin += N / 2;
      } else if (coin > 0 ) { 
         coin += (N + 5) / 2 - 1; 
      } else {
         coin = -1;
      }

      System.out.println(coin);
   }

}