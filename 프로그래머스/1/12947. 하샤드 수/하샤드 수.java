class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        int a = 0; 
        for(int i = 0; i < str.length(); i ++){
            a += str.charAt(i) - '0';
        }
        if(x%a==0){
            return true;
        }else{
            return false;
        }
    }
}