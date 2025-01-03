// num=200 ; rev=2
// num=102 ; rev=201
class Solution {
    public int reverseDigits(int n) {
        int rev=0;
        int num=0;
        while(n>0){
            int id=n%10;
            if(id!= 0){
                rev=(rev*10)+id;
            }
            n=n/10;
        }
        
        return rev;
    }
}
