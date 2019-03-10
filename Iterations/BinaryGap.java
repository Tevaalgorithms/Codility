import java.util.*;

public class BinaryGap 
{   
   public int solution(int N) 
    {
       int[] binaryResult = binaryNo(N);
       int counter = 0;
       ArrayList<Integer> al = new ArrayList<Integer>();
       boolean flag = false;
       for(int i = 0; i < binaryResult.length - 1; i++)
       {   
            // this will address the issues related to 000 cases in the beginning 
            if(binaryResult[0]==0 && (flag =! true))
            {               
                while(binaryResult[i]==0)
                {
                    i = i + 1;
                }
                flag = true;
            }            
           
           if((binaryResult[i] == 1 && binaryResult[i+1] == 0) || (binaryResult[i] == 0 && binaryResult[i+1] == 0))
           {
               counter += 1;
           }
           else
           {
               if(counter > 0)
               {
                 al.add(counter);
                 counter = 0;
               }   
           }
       }
       
       int max = 0;
       for(int j : al)
       {
           if(j > max)
           {
            max = j;   
           }
       }
       return max;
    }
    
    public int[] binaryNo(int N)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(N > 0)
        {
            int temp = N % 2;
            al.add(temp);
            N = N / 2;
        }
        int[] binaryNo = new int[al.size()];
        for(int j = 0; j < al.size(); j++)
        {
            binaryNo[j] = al.get(j);
        }
        return binaryNo;
    }
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       BinaryGap g = new BinaryGap();
        
       int k = g.solution(4);
       
       System.out.print(k);
        
    }
    
}
