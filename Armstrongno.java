class Solution {
    static String armstrongNumber(int n) {
        
        int a;
        int b = 0;
        int arm=0;
        
        a=n;
        
        while (a!=0){
            b = a % 10;
            a = a/10;
            arm= arm+(b*b*b);
            
            
        }
        
        if(arm==n){
            return "true";
        }
        else{
            return "false";
        }
        // code here
    }
    
}
