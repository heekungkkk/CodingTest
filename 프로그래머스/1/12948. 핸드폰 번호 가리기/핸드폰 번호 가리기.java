class Solution {
    public String solution(String phone_number) {
        String answer = "";
       
        for(int j = 0; j < phone_number.length()-4; j ++){
            answer += "*";
        }
        for(int j = phone_number.length()-4;j< phone_number.length(); j ++){
             answer += phone_number.charAt(j);
        }
        return answer;
    }
}