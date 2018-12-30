// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N, int M)
    {
        return N / GCD(N, M);
    }
    
    int GCD(int N, int M)
    {
        if(N % M == 0)
        {
            return M;
        }
        else
            return GCD(M, N % M);
    }
}
