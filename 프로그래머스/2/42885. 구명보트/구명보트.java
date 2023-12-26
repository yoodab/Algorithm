import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int rev = 0;
        // 두명이 탈수 있고 무게 제한보다 작아야함
        // 내림차순으로 정리
        // 무거운 사람 넣고 가장 가벼운사람 조합으로 넣어보기
        // 가장 무거운 사람+가장 가벼운 사람 <= 한계 
        // true -> 둘이 같이 탐 
        // false -> 가장 무거운 사람은 혼자 타야함
        // 두번째 무거운 사람이랑 가장 가벼운 사람
        
        Arrays.sort(people);
        for(int i=people.length-1;i>=rev;i--){
            if(people[i]+people[rev]<=limit){                
                answer++;
                rev++;
            }else{
                answer++;                
            }           
            
        }
        return answer;
        
        
    }
}