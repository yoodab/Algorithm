import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int pack = 1;
        for(int i = a;i>0;i--){
            pack *=i;
        }
        System.out.println(pack);
    }
}