import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int i = 1;
        while(i*X<=1000){
            System.out.println(i*X);
            i++;
        }
    }
}
