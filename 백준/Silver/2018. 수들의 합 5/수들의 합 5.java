import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int startNum = 1;
        int endNum = 1;
        int answer = 0;
        while (startNum <= n) {
            int sum = (endNum - startNum +1)*(startNum + endNum)/2;
            if (sum < n){
                endNum++;
            }else if (sum > n){
                startNum++;
                endNum=startNum;
            }else{
                answer++;
                startNum++;
                endNum = startNum;
            }
        }
        System.out.println(answer);
    }
}