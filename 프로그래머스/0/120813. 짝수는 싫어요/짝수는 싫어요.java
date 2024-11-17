class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2; 
        int[] result = new int[size];
        
        for (int i = 0, value = 1; i < size; i++, value += 2) {
            result[i] = value;
        }
        
        return result;
    }
}