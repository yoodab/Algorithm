import java.util.ArrayList;

public class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m);  
        int lcm = (n * m) / gcd; 
        
        return new int[]{gcd, lcm};
    }

    private int getGCD(int a, int b) {
        ArrayList<Integer> divisors = getDivisors(a);

        int gcd = 1;  
        for (int divisor : divisors) {
            if (b % divisor == 0) {  
                gcd = divisor;  
            }
        }
        return gcd;
    }

    private ArrayList<Integer> getDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);  
            }
        }
        return divisors;
    }
}
