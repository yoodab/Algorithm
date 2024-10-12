import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N1 = sc.nextInt();  
        sc.nextLine();  
        
        String S2 = sc.nextLine();  
        int N2 = Integer.parseInt(S2);  
        
        System.out.println(N1 * Character.getNumericValue(S2.charAt(2))); 
        System.out.println(N1 * Character.getNumericValue(S2.charAt(1))); 
        System.out.println(N1 * Character.getNumericValue(S2.charAt(0))); 
        System.out.println(N1 * N2);
    }
}
