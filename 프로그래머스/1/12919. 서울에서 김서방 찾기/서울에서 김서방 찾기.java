class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        for(String name : seoul){
            if(name.equals("Kim")){
                answer = i + "";
            }
            i++;
        }
        return "김서방은 "+answer+"에 있다";
    }
}