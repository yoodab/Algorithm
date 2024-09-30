class Solution {
    public int solution(int num) {
        int answer = 0;
        while(true){
            if(num!=1){
                if(num % 2 == 1){
                    num = num * 3 + 1;
                }else{
                    num = num / 2;
                }
                answer += 1;
            }else{
                return answer;
            }
            if (answer > 500){
                return -1;
            }
        }
    }
}