package lab1;
import java.util.Scanner;
public class Gcd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the First number:");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number:");
        int num2=sc.nextInt();

        int smallNumber=num1<=num2?num1:num2;
        int i=1,gcd=1;
        while (i<=smallNumber) {
            if(num1%i==0 && num2%i==0){
                if(i>=gcd){
                    gcd=i;
                }
            }
            i++;
        }

          System.out.println("The gcd of "+num1+ " and "+num2+" is "+gcd);


}
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
 */