// Question URL: https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) 
    {
        int length = A.length + 1;
        
        boolean[] bitmap = new boolean[length];
        
        bitmap[0] = true;
        
        for(int i = 0; i < A.length; i++)
        {
         if(bitmap.length > A[i])
         {
            if(!bitmap[A[i]])
            {
                bitmap[A[i]] = true;
            } 
         }
        }
        
        for(int k = 0; k < bitmap.length; k++)
        {
            if(bitmap[k]!=true)
            {
                return 0;
            }
        }
        return 1;
    }
}
