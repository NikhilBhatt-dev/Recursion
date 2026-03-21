
import java.util.ArrayList;



public class DiceList { 
    public static void main(String[] args) {
      System.out.println(  dice("" , 3));
    }
     static ArrayList<String> dice(String p , int target){
        if(target == 0){

            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;
        }

      ArrayList<String> List = new ArrayList<>();
     for(int i=1;  i<=6&& i <= target; i++){
      List.addAll( dice( p +i ,target -i));
    
     }
     return List;
}

}