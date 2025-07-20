<<<<<<< HEAD
package lab1;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fact=1,i=1,num;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        while (i<=num) {
            fact=fact*i;
            i++;
        }

            System.out.println("The factorial of "+num+" is "+fact);

    }
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
=======
package lab1;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fact=1,i=1,num;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        while (i<=num) {
            fact=fact*i;
            i++;
        }

            System.out.println("The factorial of "+num+" is "+fact);

    }
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
>>>>>>> 7ea54ec (added Volume)
 */