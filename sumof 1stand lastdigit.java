class Solution
{
    public int corner_digitSum(int n)
    {
        int single=n%10;   // for single digit number eg n = 1 , sum = 1; 
        int num=n/10;
        if(num==0){
            return n;
        }
        int sum=0;  
        int first=0;
        int last=n%10;   // last digit number
      
       while(n>0){       // while is used only to find 1st digit number       
           first=n%10;
           n=n/10;
       }
         sum=first+last;
           return sum;   
       
    }  
    
}
