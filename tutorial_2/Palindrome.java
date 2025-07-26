package tutorial_2;
import java.util.*;
public class Palindrome {
    public static void main(String args []){
        System.out.println("Enter the number:");
      Scanner sc=new Scanner(System.in);
      long num=sc.nextLong();
      int reverse=0;
      long temp=num;
      while(temp!=0){
        int remain= (int) temp%10;
        reverse=reverse*10+remain;
        temp=temp/10;
      }
      if(num==reverse){
        System.out.println(num+" is a palindrome");
      }
      else{
              System.out.println(num+" is not a palindrome");
      }
    }
}
/*
 author:Gokul Shaji
 Date:24/7/2025
 */

