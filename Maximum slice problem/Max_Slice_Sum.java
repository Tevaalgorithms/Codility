// Question URL: https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int global_sum = A[0];
        int current_sum = A[0];
        for(int i = 1; i < A.length; i++)
        {
            current_sum = Math.max(A[i], current_sum + A[i]);
            if(current_sum > global_sum)
            {
                global_sum = current_sum;
            }
        }
        return global_sum;
    }
}
