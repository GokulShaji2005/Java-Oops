package tutorial_3;
import java.util.Scanner;
public class OddAndEven {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int limit=sc.nextInt();
        int [] numbers=new int[limit];
        int odd=0,even=0;

        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();

        }
        System.out.println("The Even numbers:");
      for(int i=0;i<numbers.length;i++){
      if(numbers[i]%2==0){
        even++;
      }
    
      else{
     
        odd++;
      }
      }

      System.out.println("The number of odd: "+odd);
      System.out.println("The number of even: "+even);
}
}
