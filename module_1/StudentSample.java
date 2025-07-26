package module_1;
import java.util.*;

 class SampleData {
    private String name;
    private int age;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentSample {
 

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	        SampleData student = new SampleData();
	        System.out.print("Enter name: ");
	        student.name = sc.nextLine();
	        System.out.print("Enter age: ");
	        student.age = sc.nextInt();
	        student.display();
	        sc.close();
}

    }

    


