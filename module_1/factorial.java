package module_1;
import java.util.Scanner;
public class factorial {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
     int number,fact=1;
    
     System.out.println("Enter the number:");
     number=sc.nextInt();
     for(int i=1;i<=number;i++){
        fact=fact*i;
     }

     System.out.println("The factorial of "+ number +" is "+ fact);
     

    }

    
}

/*
 author:Gokul Shaji
 Date:15/7/2025
 */