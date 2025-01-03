*/ 1+(1+3)+(1+3+5)+(1+3+5+7)+_____+(2n-1)./*
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
