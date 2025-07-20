<<<<<<< HEAD
package lab1;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args []){
        int count=0;
        
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
        int number=sc.nextInt();
        
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0){
              count++;
            }
      
        }

        if(count==0 && number>1){
            System.out.println(number+" is prime number");
        }

        
        else{
            System.out.println(number+" is not prime number");
        }


    }
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
=======
package lab1;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args []){
        int count=0;
        
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
        int number=sc.nextInt();
        
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0){
              count++;
            }
      
        }

        if(count==0 && number>1){
            System.out.println(number+" is prime number");
        }

        
        else{
            System.out.println(number+" is not prime number");
        }


    }
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
>>>>>>> 7ea54ec (added Volume)
 */