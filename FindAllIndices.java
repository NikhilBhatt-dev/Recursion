
import java.util.ArrayList;

public class FindAllIndices {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,3};
        int target = 3;

        System.out.println(find(arr, target, 0));
    }

    static ArrayList<Integer> find(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        // Base condition check 
        if(index == arr.length){
            return list;
        }

        // If element found
        if(arr[index] == target){
            list.add(index);
        }

        // Recursive call
        ArrayList<Integer> ansFromBelowCalls = find(arr, target, index+1);

        list.addAll(ansFromBelowCalls);// array list merge krega

        return list;
    }
}