class Solution {
    public int solution(String t, String p) {
        int count = 0; 
        int lengthP = p.length();

        for (int i = 0; i <= t.length() - lengthP; i++) {
            String subString = t.substring(i, i + lengthP); 
            
            if (Long.parseLong(subString) <= Long.parseLong(p)) {
                count++; 
            }
        }

        return count; 
    }
}