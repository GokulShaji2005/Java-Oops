package tutorial_2;
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
          System.out.print(a);
          return;
       }
      
       else if(limit==2){
          System.out.print(a+" ");
          System.out.print(b);
          return;
       }
       else{
          System.out.print(a+" ");
          System.out.print(b+" ");
       }
        for(int i=0;i<limit-2;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
/*
 * author:Gokul Shaji
 * Date:24-7-2025
 */

 
