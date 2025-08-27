package tutorial_6_Dummy;
import tutorial_6.*;

class EmployeeDummyClass{
    void EmployeeAnother(){
        showSalary();
    }



}

public class EmployeeDummy{
    public static void main(String args[]){
        int salary;

        EmployeeDummyClass emp2=new EmployeeDummyClass();
        emp2.EmployeeAnother();

    }
}