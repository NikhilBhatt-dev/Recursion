
import java.util.ArrayList;

// public class PhonePadList {
//     public static void main(String[] args) {
//         // pad("" , "13");
//         pad("", "12");
        
//     }

//     static void pad(String p , String up){
//         if(up.isEmpty()){
//             System.out.println(p);
//             return;
//         }

//         int digit = up.charAt(0) - '0' ; // this will convert "2" to 2
//         for(int i =(digit-1)*3; i<digit*3; i++){
//             char ch  = (char) ('a' + i);
//             pad(p +ch, up.substring(1));
//         }  
//     }
// }



public class PhonePadList {
    public static void main(String[] args) {
       System.out.println( pad("", "23"));
    }

    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list =  new ArrayList<>();
            list.add(p);
            return list;
        }

        String[] map = {
                "",     //0
                "",     //1
                "abc",  //2
                "def",  //3
                "ghi",  //4
                "jkl",  //5
                "mno",  //6
                "pqrs", //7
                "tuv",  //8
                "wxyz"  //9
        };

        int digit = up.charAt(0) - '0'; // this will convert "2" to 2
        ArrayList<String> list = new ArrayList<>();
        String letters = map[digit]; // "Digit ke corresponding keypad letters nikaalo"

        for(int i = 0; i < letters.length(); i++){
          list.addAll( pad(p + letters.charAt(i), up.substring(1)));
        }
        return list;
    }
}