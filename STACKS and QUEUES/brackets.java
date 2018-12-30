// Question URL: https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(String S) 
    {
        char[] temp = new char[S.length()];
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < S.length(); i++)
        {
          char t = S.charAt(i);
          if((t == '(') || (t == '[') || (t == '{'))
          {
              st.push(t);
          }
          else
          {
             if(!st.isEmpty())
             {
                char c = st.peek();
                if(checkBrackets(c, t))
                {
                   st.pop();   
                }
             }
             else
             {
                return 0;
             }
          }
        }
        
        if(st.isEmpty())
        {
           return 1; 
        }
        else
        {
          return 0;   
        }
    }
    
    public boolean checkBrackets(char s, char e)
    {
      if ((s == '(' && e == ')') || (s == '{' && e == '}') || (s == '[' && e == ']'))
      {
          return true;
      }
      else
       return false;
    }
}
