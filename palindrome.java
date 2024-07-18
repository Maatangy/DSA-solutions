class Solution
{
    public String is_palindrome(int n)
    {
        int rev=0;
        int original=n;
        int a=n;
        
        while(n!=0){
            
            rev=rev*10+n%10;
            n=n/10;
        }
        else if(rev==original){
            return "yes";
        }
        else{
            return "no";
        }
    }
}
