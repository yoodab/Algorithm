class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        int bigN = 0;
        int start = 0;
        
        // number의 1 ~ k+1에서 될 수 있는 가장 큰 숫자 = 첫번째 자리
        // 2 ~ k+2에서 가장큰수 = 두번째 자리 
        for(int i=0; i<number.length()-k;i++){
            bigN=0;
            for(int j=start; j<=k+i; j++){
                if(bigN < (number.charAt(j)-'0')){
                    bigN=(number.charAt(j)-'0');
                    start = j+1;
                }
                
            }

            answer.append(bigN);

        }
        return answer.toString();
    }
}