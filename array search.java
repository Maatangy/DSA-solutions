// searching the elements index 
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 546, 456, 45, 23, 345, 456, 342};
        int n = 8, x = 456;
        int flag = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = i;
                break;
            }
        }

        if (flag == -1) {
            System.out.println("Not present");
        }
        System.out.println(flag);
    }
}
