class Solution {
    public int[] solution(int[] arr) {
        
        int idx=0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                idx++;
            }
        }
        int[] X = new int[idx];
        idx=0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i]; j++){
                X[idx++] += arr[i];
            }
        }
        return X;
    }
}