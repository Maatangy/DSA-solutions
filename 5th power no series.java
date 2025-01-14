  // 1^5 + 2^5 + 3^5 + 4^5 + _____ + n^5  //
  // basic approach 
  lass Solution {
    long sumOfFifthPowers(long N) {
        int sum=0;
        for(int i=1;i<=N;i++){
            int fif=i*i*i*i*i;
            sum=sum+fif;
        }
        return sum;
    }
}
// optimal approach 
class Solution {
    long sumOfFifthPowers(long N) {
      long ans = ((N * N) * (N + 1) * (N + 1) * (2 * N * N + 2 * N - 1)) / 12;   // formula for finding sum of series raised to 5th power 
        return ans;
    }
}
