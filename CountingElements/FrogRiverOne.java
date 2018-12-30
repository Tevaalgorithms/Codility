// Question URL: https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) 
    {
        int steps = X;
        
        boolean[] bitmap = new boolean[steps + 1];
        
        for(int i = 0; i < A.length; i++)
        {
         
         if(!bitmap[A[i]])
         {
          bitmap[A[i]] = true;
          steps --;
         }
         
         if(steps == 0) return i;
         
        }
        
        return -1;
    }
}
