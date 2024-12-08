import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        switch(size){
            case 29:
            System.out.println("Small");
            break;
             case 30:
            System.out.println("Medium");
            break;
             case 38:
            System.out.println("Large");
            break;
             case 40:
            System.out.println("XLarge");
            break;
            default:
            System.out.println("invalid input");
            break;
        }
    }
}
