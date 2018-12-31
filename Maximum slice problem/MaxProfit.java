// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) 
    {
        if(A.length < 2)
        {
            return 0;
        }
        
        int maxSoFar = 0;
        int maxEndingHere = 0;
        int minPrice = A[0];
        
        for(int i = 0; i < A.length; i++)
        {
            maxEndingHere = Math.max(0, A[i] - minPrice);
            minPrice = Math.min(minPrice, A[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        
        return maxSoFar;
    }
}
