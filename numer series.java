*/ 1+(1+2)+(1+2+3)+(1+2+3+4)+____ /*

  class Solution {
    static long sumOfTheSeries(long n){
          int sum=0;
          int tot=0;
          for(int i=1;i<=n;i++){
              sum=sum+i;
              tot=tot+sum;
    }
    return tot;
}
}
