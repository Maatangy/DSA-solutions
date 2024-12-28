class Solution{
    static long kthDigit(int A,int B,int K){
          long power=(long)Math.pow(A,B);
        long i=1;
        
        while(power>0){
            long ans=power%10;
            if(i==K){
                System.out.println(ans);
                break;
            }
            i++;
            power=power/10;
        }
        }
    }
