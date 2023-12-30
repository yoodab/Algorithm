import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int N = 0;
        if(X>0 && Y>0){
            N=1;
        }else if(X>0 && Y<0){
            N=4;
        }else if(X<0 && Y>0){
            N=2;
        }else{
            N=3;
        }
        System.out.println(N);
        
    }
}