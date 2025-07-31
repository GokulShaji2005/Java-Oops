package lab_2;
import java.util.*;
public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='Y';
		int i=0;
	   while(ch=='Y'){
		if(i!=0){
			 System.out.println("Do you want to continue: Y/N");
			 ch =sc.next().charAt(0);
		}
		  

			 if(ch=='N'){
				System.out.println("Operation ended");
				break;
			 }
			System.out.println(".....Calculator Menu....");
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			
			
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			System.out.println("Enter Two numbers:");
			float num1=sc.nextInt();
			float num2=sc.nextInt();
			
		
				Calculator operation=new Calculator(num1,num2);
				float result=0;
			
			switch(choice){
				case 1:result=operation.add();
				break;
				
				case 2:result=operation.subtract();
				break;
				
				case 3:result=operation.multiply();
				break;
				
				case 4:  result=operation.divide();
				break;
			}
			
			System.out.println("Result: "+ result);
				i++;
	   }

		

	}

}

class Calculator{
	float num1,num2;
Calculator(float n1,float n2){
	num1=n1;
	num2=n2;
}

float add() {
	return num1+num2;
}


float subtract() {
	return num1-num2;
}
	

float multiply() {
	return num1*num2;
}
	

float divide() {
	return (float)(num1/num2);
}
	
	
}