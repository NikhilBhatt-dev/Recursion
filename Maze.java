public class Maze {
    public static void main(String[] args) {
        System.out.print("toatal path is : " + mazees(3, 3));
        System.out.println();
        path("", 3, 3);
        
     }
    static  int mazees(int r, int c){
        if( r==1 || c==1 ){
            return 1;
        }
        int left = mazees(r, c-1);
        int right = mazees(r-1, c);
        return left + right;
    }
    static void  path (String p ,int r ,int c){
         if( r==1 & c==1 ){
            System.out.println(p);
            return ;
        }
        if(r>1) {
            path(p+"D",  r-1, c);
        }
        if(c>1) {
            path(p+"R", r, c-1);
        }


    }
    
}
