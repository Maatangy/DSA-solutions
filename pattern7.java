*/ 5 4 3 2 1
   4 3 2 1
   3 2 1 
   2 1
   1 /*
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
	    int n=scan.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
