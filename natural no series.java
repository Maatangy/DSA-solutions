*/ 1+2+3+4+5+_____n /*
  
  class Solution {
    static long sumOfTheSeries(long n){
        int sum=0;
        int tot=0;
        for(int i=1;i<=((2*n)-1);i=i+2){
            sum=sum+i;
            tot=tot+sum;
        }
        return tot;
    }
}
