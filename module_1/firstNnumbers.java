package module_1;
import java.util.Scanner;
public class firstNnumbers {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int limit;
      int sum=0;
      System.out.println("Enter the limit:");
      limit=sc.nextInt();

      for(int i=1;i<=limit;i++){
        System.out.println(i);
        sum=sum+i;
      }
      System.out.println("The sum of first"+" "+limit+" numbers is"+" "+sum);
    }
}
