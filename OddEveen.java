public class OddEveen {
     public static void main(String[] args) {
        int n =699;
        System.out.println(isOdd(n));
     }
     private static boolean isOdd(int n) {
       return (n & 1) == 1;
     }
}
