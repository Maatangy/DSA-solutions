//Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine();
        String n2 = scan.nextLine();
        int n = scan.nextInt();
        for(int i=1 ; i<=n ; i++){
            System.out.println(n1+" "+n2);
        }
        
        }
    }
