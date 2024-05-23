import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import java.util.Arrays;
import java.lang.StringBuilder;
class Solution {
    public long solution(long n) {
        // 1. 숫자를 문자열로 변환
        String numberStr = Long.toString(n);
        
        // 2. 문자열을 문자 배열로 변환
        char[] charArray = numberStr.toCharArray();
        
        // 3. 문자 배열을 정렬 (내림차순)
        Arrays.sort(charArray);
        
        // 4. 내림차순으로 바꾸기 위해 역순으로 배열
        StringBuilder sortedNumberStr = new StringBuilder(new String(charArray)).reverse();
        
        // 5. 정렬된 문자열을 다시 숫자로 변환
        return Long.parseLong(sortedNumberStr.toString());
    }
}