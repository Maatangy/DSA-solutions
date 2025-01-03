/* 1^3 + 2^3 + 3^3 + 4^3 + 5^3 +_____ /*
  class Solution {
    int sumOfSeries(int n) {
        int cub=0;
        int sum=0;
        for(int i=1;i<=n;i++){
         cub=i*i*i;
            sum=sum+cub;
            
        }
        return sum;
    }
}
