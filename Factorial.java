public class Factorial {
    public static void main(String[] args) {
        int n = 8;
        System.out.print("print the factorial 0 to " + n +" : " );
        for (int i = 0; i < n; i++) {
            System.out.print(facto(i) +  " ");
            
        }
        
    }

   static int facto(int n){
    if(n == 0 || n == 1){
        return 1;
    }
    return n * facto(n - 1);
    }

    
}
