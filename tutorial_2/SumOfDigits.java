package tutorial_2;
import java.util.*;
public class SumOfDigits {
    public static void main(String args []){
        System.out.println("Enter the number:");
      Scanner sc=new Scanner(System.in);
      long num=sc.nextLong();
      int sum=0;
      long temp=num;
      while(num!=0){
        int remain= (int) num%10;
        sum=sum+remain;
        num=num/10;
       
      }
     
      System.out.println("The sum of digits of "+temp+ " is "+sum);

    }
}
/*
 author:Gokul Shaji
 Date:24/7/2025
 */

