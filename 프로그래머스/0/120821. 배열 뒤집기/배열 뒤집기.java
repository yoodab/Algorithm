class Solution {
    public int[] solution(int[] num_list) {
        int[] reversed = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            reversed[i] = num_list[num_list.length - 1 - i];
        }
        return reversed;
    }
}