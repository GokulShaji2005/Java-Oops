package tutorial_6;

class Employee{
    protected int salary;
    Employee(int salary){
        this.salary=salary;
    }
    protected void showSalary(){
        System.out.println(("Salary: "+ salary));
    }
}

class Manager extends Employee{
 

Manager(int salary){
    super(salary);
  

}

void ManagerInfo(){
    System.out.println("Salary Variable from manager class:"+salary);
    System.out.println("The Employee Salary for mananger:");
    showSalary();
}

    }




public class EmployeeDemo {
    public static void main(String[] args) {
        int salary;
        Manager emp1=new Manager(30000);
        emp1.ManagerInfo();
    }
}
