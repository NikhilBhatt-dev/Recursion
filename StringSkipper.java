public class StringSkipper {
    public static void main(String[] args) {
        skip("", "baccha");
    }

    static void skip(String newStr, String str) {
        if (str.isEmpty()) {
            System.out.println(newStr); // print processed string
            return;
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            skip(newStr, str.substring(1));
        } else {
            skip(newStr + ch, str.substring(1));
        }
    }
}