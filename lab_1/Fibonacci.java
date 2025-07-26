package lab_1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int limit;

        System.out.println("Enter the limit for Fibonacci series:");
        limit=sc.nextInt();
        int a=0,b=1,c;
         System.out.println("The series:");
       if(limit==1){
          System.out.println(a);
          return;
       }
      
       else if(limit==2){
          System.out.println(a);
          System.out.println(b);
          return;
       }
       else{
          System.out.println(a);
          System.out.println(b);
       }
      


        for(int i=0;i<limit-2;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
 */

 
