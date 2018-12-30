// Question link: https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Total no sum of sequence no is (n * (n + 1)) / 2
        long N = A.length; 
        long total_sum = ((N + 1) * (N + 2)) / 2;
        
        long array_sum = 0;
        
        for(int i=0; i < A.length; i++)
        {
            array_sum += (long)A[i];
        }
        
        return (int) (total_sum - array_sum);
    }
}
