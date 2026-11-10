class Solution {
    public String solution(String s) {
        String answer = "";
        int a = s.length() / 2;
        // if(s.length()%2 == 0 ){
        //     answer.setCharAt(0, s.charAt(a + 1));
        // }else {
        //     answer.setCharAt(0, s.charAt(a));
        //     answer.setCharAt(1, s.charAt(a+1));
        // }
        
        if(s.length()%2 == 0 ){
            answer += s.charAt(a-1) + "";
            answer += s.charAt(a)+ "";
        }else answer  = s.charAt(a)+ "";
        return answer;
    }
}