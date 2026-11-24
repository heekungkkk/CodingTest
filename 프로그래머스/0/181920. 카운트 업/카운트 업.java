class Solution {
    public int[] solution(int start_num, int end_num) {
        int a = start_num;
        int b = end_num;
        int c = 0;
        
        int[] answer = new int [b-a+1];
        for(int i = a; i <= b; i ++){
            answer[c] += i;
            c ++;
        }
        return answer;
    }
}