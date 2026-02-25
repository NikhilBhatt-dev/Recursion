package Recursion;
public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // base condition
        if (n > 5) {
            return; // stop recursion
        }

        System.out.println(n); // print current number
        print(n + 1);          // recursive call
    }
}
