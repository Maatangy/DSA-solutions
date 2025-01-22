//Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, and minimum element of the second array arr2.

public class Main
{
	public static void main(String[] args) {
		int [] arr1={5, 7, 9, 3, 6, 2};
		int [] arr2={1, 2, 6, 1, 9};
	    int n1=6,n2=5;
		int max=arr1[0], min=arr2[0];
		for (int i=0 ;i<n1;i++){
		    if(max<arr1[i]){
		        max=arr1[i];
		    }
		}
		for(int i=0;i<n2;i++){
		    if(min>arr2[i]){
		        min=arr2[i];
		    }
		}
		int pro=max*min;
		System.out.println(pro);
	}
}
//output  9......
