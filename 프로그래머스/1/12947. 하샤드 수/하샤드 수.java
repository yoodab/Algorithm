import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int f = x;
        int n = 0;
        
        while(x>9){
            n += x%10;
            x = x/10;
        }
        n+=x;
        
        if(f%n != 0){
            answer=false;
        }
        
        return answer;
    }
}