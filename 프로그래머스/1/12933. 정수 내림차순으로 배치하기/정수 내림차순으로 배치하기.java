import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        char arr[] = str.toCharArray();
        
        Arrays.sort(arr);
        
        String answer = new StringBuilder(new String(arr)).reverse().toString();
        
        return Long.parseLong(answer);
        
        
      }
}