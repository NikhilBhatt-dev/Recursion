public class PhonePad {
    public static void main(String[] args) {
        pad("", "23");
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
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
        String letters = map[digit]; // "Digit ke corresponding keypad letters nikaalo"

        for(int i = 0; i < letters.length(); i++){
            pad(p + letters.charAt(i), up.substring(1));
        }
    }
}