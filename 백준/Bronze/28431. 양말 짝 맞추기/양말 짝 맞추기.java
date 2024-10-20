import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] sockCount = new int[10];
        
        for (int i = 0; i < 5; i++) {
            int sock = sc.nextInt();
            sockCount[sock]++;
        }
        
        for (int i = 0; i < 10; i++) {
            if (sockCount[i] % 2 != 0) {
                System.out.println(i);
                break;
            }
        }
    }
}