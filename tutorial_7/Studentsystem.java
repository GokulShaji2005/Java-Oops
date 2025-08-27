package tutorial_7;
import java.util.*;
class Students{
    String name,course;
    int rollNo;

    Students(String name,int rollNo , String course){
        this.name=name;
        this.rollNo=rollNo;
        this.course=course;
    }

    void displayStudents(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Course: "+course);
    }

}

class StudentAccount extends Students{

    int collegeFee;

    StudentAccount(String name,int rollNo , String course,int collegeFee){
        super(name, rollNo, course);
        this.collegeFee=collegeFee;
    }


    void displayCollegeFee(){
        System.out.println("College Fee: "+collegeFee);
        
    }
}


class Hosteller extends StudentAccount{
    int hostalFee,messFee;
  

    Hosteller(String name,int rollNo , String course,int collegeFee,int hostalFee,int messFee){
  
super(name, rollNo, course, collegeFee);
        this.hostalFee=hostalFee;
        this.messFee=messFee;

        
    }


    void displayHostelFee(){
        System.out.println("Hostel Fee: "+hostalFee);
        System.out.println("Mess Fee: "+messFee);
        System.out.println("Total Fee: "+(collegeFee+hostalFee+messFee));
        
        
    }
}

class DayScholar extends StudentAccount{
    int busFee;
  

    DayScholar(String name,int rollNo , String course,int collegeFee,int busFee){
    super(name, rollNo, course, collegeFee);
        this.busFee=busFee;  
    }


    void displayBusFee(){
        System.out.println("busFee: "+busFee);
        System.out.println("Total Fee: "+(collegeFee+busFee));    
    }
}
public class Studentsystem {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name, course;
    int rollNo, collegeFee, hostalFee, messFee, busFee;

  
    System.out.println("Enter the Hosteller's name:");
    name = sc.nextLine();
    System.out.println("Enter the Roll No:");
    rollNo = sc.nextInt();
    sc.nextLine(); 
    System.out.println("Enter the Course:");
    course = sc.nextLine();
    System.out.println("Enter the College Fee:");
    collegeFee = sc.nextInt();
    System.out.println("Enter the Hostel Fee:");
    hostalFee = sc.nextInt();
    System.out.println("Enter the Mess Fee:");
    messFee = sc.nextInt();

    Hosteller h1 = new Hosteller(name, rollNo, course, collegeFee, hostalFee, messFee);

   
    sc.nextLine(); 
    System.out.println("Enter the DayScholar's name:");
    name = sc.nextLine();
    System.out.println("Enter the Roll No:");
    rollNo = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the Course:");
    course = sc.nextLine();
    System.out.println("Enter the College Fee:");
    collegeFee = sc.nextInt();
    System.out.println("Enter the Bus Fee:");
    busFee = sc.nextInt();

    DayScholar d1 = new DayScholar(name, rollNo, course, collegeFee, busFee);

    
    System.out.println("---Hosteller Details---");
    h1.displayStudents();
    h1.displayCollegeFee();
    h1.displayHostelFee();

    System.out.println("---DayScholar Details---");
    d1.displayStudents();
    d1.displayCollegeFee();
    d1.displayBusFee();
}

    
    
}
