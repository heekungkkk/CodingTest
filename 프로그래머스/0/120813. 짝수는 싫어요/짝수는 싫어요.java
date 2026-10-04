class Solution {
    public int[] solution(int n) {
        int a = 0;
        for(int i = 1; i<=n; i+=2){
            a ++;
        }
        int[] answer = new int[a];
        
        a= 0;
        for(int i = 1; i<=n; i+=2){
            answer[a] +=i;
            a++;
        }
        return answer;
    }
}