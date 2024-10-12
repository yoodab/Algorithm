import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String[] a = input1.split(" ");
        
        String input2 = sc.nextLine();
        String[] c = input2.split(" ");
        
        int bx = Integer.parseInt(c[0])-Integer.parseInt(a[2]);
        int by = Integer.parseInt(c[1])/Integer.parseInt(a[1]);
        int bz = Integer.parseInt(c[2])-Integer.parseInt(a[0]);
        
        System.out.print(bx+" "+by+" "+bz);
    }
}