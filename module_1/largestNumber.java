package module_1;
import java.util.Scanner;
public class largestNumber {
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
int num1,num2,num3,large;
System.out.println("Enter the three numbers:");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
large=(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3));

System.out.println("The largest number is "+large);
    } 
}
