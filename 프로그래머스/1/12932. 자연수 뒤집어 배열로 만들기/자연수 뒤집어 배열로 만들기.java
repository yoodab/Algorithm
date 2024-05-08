class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int i=0;
        int a=0;
        while(n>0){
            a=(int)(n%10);
            answer[i++]=a;
            n=n/10;
        }
        return answer;
    }
}