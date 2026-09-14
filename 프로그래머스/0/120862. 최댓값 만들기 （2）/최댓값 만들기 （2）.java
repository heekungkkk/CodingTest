import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // int a = 0; 
        // int a1= 0;
        // int b = 0;
        // int b1= 0;
        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] >= 0) {
        //         if (numbers[i] > a) {
        //             a1 = a;
        //             a = numbers[i];
        //         }
        //         else if (numbers[i] > a1) {
        //             a1 = numbers[i];
        //         }
        //     }
        //     else {
        //         if (numbers[i] < b) {
        //             b1 = b;
        //             b = numbers[i];
        //         }
        //         else if (numbers[i] < b1) {
        //             b1 = numbers[i];
        //         }
        //     }
        // } 
        // if((a*a1)>(b*b1)){
        //     return a*a1;
        // }
        // else {
        //     return b*b1;
        // }
        
        Arrays.sort(numbers);
        int a = numbers.length;
        int b = numbers[0]*numbers[1];
        int c = numbers[a-2]*numbers[a-1];
        if(b>c) return b;
        else return  c;
    }
}