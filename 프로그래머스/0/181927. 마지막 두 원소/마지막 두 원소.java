class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int a = num_list.length-1;
        for(int i = 0; i < num_list.length; i ++){
            answer[i] += num_list[i];
        }for(int i = num_list.length; i < num_list.length+ 1; i ++){
            if(num_list[a]> num_list[a-1]){
                answer [i] += num_list[a]-num_list[a-1];
            }else if(!(num_list[a]> num_list[a-1])) {
                answer[i] += num_list[a]* 2;
            }
        }
        return answer;
    }
}