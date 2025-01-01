import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
		    fact=fact*i;
		}
		int count=0;
		while(fact>0){
		    int id=fact%10;
		    if(id==0){
		        count++;
		    }
		    fact=fact/10;
		}
		System.out.println(count);
	}
}
