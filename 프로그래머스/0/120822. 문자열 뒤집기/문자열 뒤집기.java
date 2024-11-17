class Solution {
    public String solution(String my_string) {
        String reversed = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            reversed += my_string.charAt(i);
        }
        return reversed;
    }
}