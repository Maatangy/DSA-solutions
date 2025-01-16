public class Main
{
	public static void main(String[] args) {
        int n=8 , sum=0;
        int arr[]={2,10,24,21,3,44,60,4};
        int large=arr[0];
        for(int i=0;i<n;i++){
            if(large<arr[i]){
            large=arr[i];
        }
	}
	 System.out.println(large);
}
}
