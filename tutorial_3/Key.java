package tutorial_3;
import java.util.*;
public class Key {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int f=0;
        System.out.println("Enter the number of terms:");
        int limit=sc.nextInt();
        int [] numbers=new int[limit];
     

        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();

        }
        System.out.println("The order:");
      for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
      }
           System.out.println("\n");
      System.out.println("Enter the key:");
        int key=sc.nextInt();
     
       for(int i=0;i<numbers.length;i++){
        if(key==numbers[i]){
            System.out.println("The number "+key+" is found in "+i+"th index");
            f=1;
            break;
        }
       
       
      }

      if(f==0){
             System.out.println("The number "+key+" is not in the array");
        }




}
}
