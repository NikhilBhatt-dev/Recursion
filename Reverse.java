public class Reverse {

    static  int sum =0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;   //rem = 1234 % 10 = 4
        sum = sum*10 + rem; //sum = 0 * 10 + 4 = 4
        rev1(n/10); //n = 1234 / 10 = 123
    }
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
        
    }
    

    
}
