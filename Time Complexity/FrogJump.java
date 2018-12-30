// Question URL: https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        int counter = 0;
        int temp = (Y - X) % D;
        if(temp != 0)
        {
            int t = (Y - X) / D;
            counter = t + 1;
        }
        else
            counter = (Y - X) / D;
            
        return counter;
    }
}
