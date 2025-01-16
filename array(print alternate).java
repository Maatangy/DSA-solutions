// question You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).
//Input: arr[] = [1, 2, 3, 4]
//Output: 1 3
//Take first element: 1
//Skip second element: 2
//Take third element: 3
//Skip fourth element: 4         hint=change increment value in for loop alone 
public class Main
{
	public static void main(String[] args) {
        int n=10 ;
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<n;i+=2){     // i=i+2 or i+=2 
            System.out.println(arr[i]); 
        }
	}
	
}
