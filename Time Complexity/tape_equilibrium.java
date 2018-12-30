// Question URL: https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 public int solution(int[] A) {
        int N = A.length;

        int[] sum = new int[N+1];
        
        for (int i = 1; i <= N; i++) 
        {
            sum[i] = sum[i-1] + A[i-1];
        }
        
        int total_sum = sum[N];       
              
        // NOTE: THE LEFT SHIFT OF 2
        // IF WE DON'T USE THAT, the actual step would the following
        // Step one: Left side sum of array in the very first case is 3
        // Step two: Right sid sum of array in the very first step is Total sum(13) - 3 = 10
        // Step Three: Difference is 10 - 3 = 7
        // However, here the <<1 operator helps to elimiate the above step 2 ans step 3
        
	      int minDiff = Math.abs((sum[1]<<1) - total_sum);
        
        for (int i = 2; i < N; i++) 
        { 
	          minDiff = Math.min(minDiff, Math.abs((sum[i]<<1) - total_sum));
        }
        return minDiff;
    }
