public class Main
{
	public static void main(String[] args) {
        int n=5 , sum=0;
        int arr[]={1,3,5,7,8};
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(smallest>arr[i]){
            smallest=arr[i];
        }
	}
	 System.out.println(smallest);
}
}
