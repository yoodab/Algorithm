import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        String answer = "";
        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            if(A<X){
                answer = answer+A+" ";
            }
        }
        System.out.println(answer);
        
    }
}