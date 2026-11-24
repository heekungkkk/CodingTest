class Solution {
    public int solution(int order) {
        int answer = 0;
        String order1 = String.valueOf(order);
        for(int i = 0; i < order1.length(); i ++){
            if(order1.charAt(i)=='3'){
                answer ++;
            }else if (order1.charAt(i) =='6'){
                answer ++;
            }else if(order1.charAt(i)=='9'){
                answer ++;
            }
        }
        return answer;
    }
}