// skip app not appple
public class SkipApp{
 

    public static void main(String[] args) {
        System.out.println(skipApp("bacappcha , apple"));
    }

    static String skipApp(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (!str.startsWith("apple") && str.startsWith("app")) {
            return skipApp(str.substring(3));
        } else {
            return str.charAt(0) + skipApp(str.substring(1));
        }
    }
}
