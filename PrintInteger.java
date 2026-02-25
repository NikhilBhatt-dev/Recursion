import java.util.*;

public class PrintInteger {

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PI(n);

        sc.close();   
    }

    static int PI(int n) {
        if (n == 1) {
            System.out.println(  1);
            return 1;
        }

        PI(n - 1);
        System.out.println(n);

        return n;
    }
}
