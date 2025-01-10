//Consider a sample space consisting of all perfect squares starting from 1, 4, 9 and so on. 
//You are given a number n, you have to find the number of integers less than n in the sample space.
// lame approach 
class Solution {
    static int countSquares(int n) {
        int count=0;
     for(int i=1;i<n;i++){
        int sqrt = (int) Math.sqrt(i);
        if(sqrt*sqrt==i){
            count++;
        }
     }
     return count;
    }
}
//optimal approach
class Solution {
    static int countSquares(int n) {
        return (int) Math.sqrt(n - 1);
    }
}

    
    
