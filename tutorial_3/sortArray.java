
package tutorial_3;
import java.util.*;
public class sortArray {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int limit=sc.nextInt();
        int [] numbers=new int[limit];
        int [] sorted=new int[limit];

        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();

        }
        System.out.println("The order:");
      for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
      }

     Arrays.sort(numbers);
System.out.println(" ");
System.out.println("The sorted array:");
  for(int j=0;j<numbers.length;j++){
        System.out.print(numbers[j]+" ");
      }

}
}
