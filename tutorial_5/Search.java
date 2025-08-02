package tutorial_5;
import java.util.Scanner;
import java.util.Vector;

public class Search {
    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the key:");
    String key=sc.nextLine();
    Vector <String> items=new Vector<>();

        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");
        
int flag=0;
       for(int i=0;i<items.size();i++){
         if((items.get(i)).equalsIgnoreCase(key)){
            System.out.println("Item found");
            flag=1;
            break;
         }

        }

        if(flag==0){
            System.out.println("Item is not found");
        }
}
}
