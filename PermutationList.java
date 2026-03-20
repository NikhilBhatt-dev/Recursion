import java.util.ArrayList;

public class PermutationList {
    public static void main(String[] args) {
        ArrayList<String> ans = permutation("", "abs");
        System.out.println(ans);
    }

    static ArrayList<String> permutation(String p, String up) {

        // Base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            // recursive call
            ArrayList<String> recAns =
                    permutation(first + ch + second, up.substring(1));

            ans.addAll(recAns);
        }

        return ans;
    }
}