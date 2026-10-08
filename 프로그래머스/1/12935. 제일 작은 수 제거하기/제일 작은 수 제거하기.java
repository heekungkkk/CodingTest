class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length==1?1:arr.length-1];
        int min = arr[0];
        int a = 0;
        if(arr.length == 1) answer [0] += -1;
        else {
            for(int i = 1; i < arr.length; i ++){
                if(min > arr[i]) min = arr[i];
            }
            for(int i = 0; i <arr.length; i ++){
                if(arr[i] != min ){
                    answer[a] +=arr[i];
                    a++;
                }
            }
        }
    
        return answer;
    }
}