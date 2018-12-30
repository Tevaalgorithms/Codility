// Question URL: https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
// you can also use imports, for example:
// 

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;
        for(int i: A)
        {
          if(i == min)   
          {
             min++;   
          }
        }
        return min;
    }
}
