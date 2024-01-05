import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int i = 0;
        for(int[] command:commands){
            int[] copyArr = Arrays.copyOfRange(array,command[0]-1,command[1]);
            Arrays.sort(copyArr);
            answer[i]=copyArr[command[2]-1];
            i++;
        }
        
        return answer;
    }
}