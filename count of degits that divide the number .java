class Solution{
    static int evenlyDivides(int N){
        int temp = N; 
        int d=0 ;
        int count=0 ;
        
        while (temp!=0){
            d=temp%10;
            temp=temp/10;
            
            if(d>0 && N%d==0){
                
                count=count+1;
            }
            
        }
        return count;
    }  
}
