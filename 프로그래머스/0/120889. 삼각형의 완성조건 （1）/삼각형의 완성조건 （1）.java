import java.util.*;

class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        int a = sides[2];
        int b = sides[1]+sides[0];
        return (a<b) ? 1:2;
        
    }
}