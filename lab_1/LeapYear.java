package lab_1;
import java.util.Scanner;
public class LeapYear {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year;

        System.out.println("Enter the Year:");
        year=sc.nextInt();
    if((year%4==0 && year%100!=0)|| year%400==0){
              System.out.println(year+" is a leap Year");
    }
    else{
         System.out.println(year+" is not a leap Year");
    }
}

}

/*
 * author:Gokul Shaji
 * Date:18-7-2025
 */
