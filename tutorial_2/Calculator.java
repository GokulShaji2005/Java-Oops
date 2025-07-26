package tutorial_2;
import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNum=sc.nextInt();
        System.out.println("Enter the second number:");
        int secondNum=sc.nextInt();
        System.out.println("Enter the Operator '+,-,*,/':");
        String Operator=sc.next();
        int result=0;
        switch(Operator){
            case "+":result=firstNum+secondNum;
            break;
             case "-":result=firstNum-secondNum;
            break;
             case "*":result=firstNum*secondNum;
            break;
             case "/":result=firstNum/secondNum;
            break;
        
        }

        System.out.println("The result is "+result);
    }
}
/*
 author:Gokul Shaji
 Date:24/7/2025
 */