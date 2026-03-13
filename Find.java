public class Find {
    public static void main(String[] args) {
        int arr[] = {1,2,345,6,7,5};
        int target =7;
        System.out.println(find(arr, target, 0));
        
    }
    static  boolean find(int[] arr, int target , int index){
        if(index == arr.length){
            return false;
                }
                return arr[index] == target || find(arr, target, index+1);

    } 
    
}
