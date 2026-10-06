class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pcnt= 0;
        int Ycnt= 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
                Pcnt ++;
            }else if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                Ycnt++;
            }
        }
        if(Ycnt==Pcnt){
            return answer;
        }else{
            answer = false;
            return answer;
        }

       
    }
}