// Question link: https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
class Solution 
{
    public int[] solution(int[] A, int K) 
    {
        if(A.length < 1) return A;
        int l = K % A.length;
        for(int i = 0; i < l; i++)
        {
            rotateArray(A);
        }
        return A;
    }
    
    public int[] rotateArray(int[] A)
    {
     int temp = A[A.length - 1];
     
     for(int j = A.length - 1; j >= 1; j--)
     {
         A[j] = A[j-1];
     }
     
     A[0] = temp;
     
     return A;
    }
}
