package tutorial_5;
import java.util.Vector;

public class Remove {
    public static void main(String[] args) {
        
       Vector <String> fruits=new Vector<>();

        fruits.add("Red");
        fruits.add("Blue");
        fruits.add("Green");
        fruits.add("Yellow");
        

        for(String i:fruits){
System.out.print(i+" ");
        }
        System.out.print("\n ");
        fruits.remove(2);
          for(String i :fruits){
System.out.print(i+" ");
    
}
    }
}
