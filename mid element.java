class Solution {
    int middle(int a, int b, int c) {
        int mid=0;
        if(a>b && a>c){
            if(b>c){
                mid=b;
            }
            else{
                mid=c;
            }
        }
        if(b>a && b>c){
            if(a>c){
                mid=a;
            }
            else{
                mid=c;
            }
        }
         if(c>a && c>b){
            if(a>b){
                mid=a;
            }
            else{
                mid=b;
            }
        }
        
        return mid;
        
    }
}
