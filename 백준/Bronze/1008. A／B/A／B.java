import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println(a/b);

        // float double => 정밀도 차이
        // float => 소수점 6~7자리 표현 가능
        // double => 소수점 15~16자리 표현 가능

        // 코테에서 소수점 표현시 double 사용하는 것이 좋다
    }
}
