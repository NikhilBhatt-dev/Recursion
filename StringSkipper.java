public class StringSkipper {
public static void main(String[] args) {
    skip("", "baccha");
    
}   

static void skip(String p, String up)
//p → processed string

//up → unprocessed string
 
{
    if(up.isEmpty()) {
        System.out.println(p);
        return;
    }

    char ch = up.charAt(0);
    if( ch == 'a'){
        skip(p, up.substring(1)); //substring(1) → gives a new string starting from index 1
    }else{
        skip(p +ch ,up.substring(1));
    }
     
    
}

}
