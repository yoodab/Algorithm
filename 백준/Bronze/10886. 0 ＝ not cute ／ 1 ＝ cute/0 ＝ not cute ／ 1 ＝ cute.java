import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            int a = sc.nextInt();
            if(a<1){
                sum = sum-1;
            }else if(a==1){
                sum = sum+1;
            }
        }
        if(sum>0){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }
    }
}