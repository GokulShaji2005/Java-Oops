package module_1;
import java.util.Scanner;
public class MyDetails{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the full name:");
        String name=sc.nextLine();
          System.out.println("Enter the age:");
        int age=sc.nextInt();
          System.out.println("Enter the Mobile Number:");
        long mobileNumber=sc.nextLong();
          System.out.println("Enter the CGPA:");
        double cgpa=sc.nextDouble();
          System.out.println("Enter the Attendence percentage:");
        float Attendence=sc.nextFloat();
            float AttendenceMark;
        if(Attendence>=90){
          AttendenceMark=10;
        }
        else{
      AttendenceMark=Attendence/10;
        }

        System.out.println("   My Details  ");
        System.out.println("...................");
        System.out.println("Full Name:       "+name);
        System.out.println("Age:             "+age);
        System.out.println("Mobile Number:   "+mobileNumber);
        System.out.println("CGPA:            "+cgpa);
        System.out.println("Attendence Mark:  "+AttendenceMark);
    }
}