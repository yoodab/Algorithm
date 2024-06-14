class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long counts = 0;
        for(int i=1; i<count+1;i++){
            counts += i;
        }
        answer = counts*price-money;
        if(counts*price<money)answer = 0;
        return answer;
    }
}