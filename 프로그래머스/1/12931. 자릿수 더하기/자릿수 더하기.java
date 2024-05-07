import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nS = Integer.toString(n);
        for(int i=0;i<nS.length();i++){
            answer += Character.getNumericValue(nS.charAt(i));
        }

        return answer;
    }
}