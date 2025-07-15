package module_1;
import java.util.Scanner;
public class gradeCard {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int score;
        char grade;
        String name;

        System.out.println("Enter the name:");
        name=sc.nextLine();
        
        System.out.println("Enter the Score:");
        score=sc.nextInt();

        if(score>=90){
            grade='S';
        }

        else if(score>=80 && score<90){
            grade='A';
        }

         else if(score>=70 && score<80){
            grade='B';
        }

        else if(score>=60 && score<70){
            grade='C';
        }

        else if(score>=50 && score<60){
            grade='D';
        }

        else{
            grade='F';
        }

        System.out.println("Name: "+name);
        System.out.println("Score: "+score);
        System.out.println("Grade: "+grade);

    }

}

/*
 author:Gokul Shaji
 Date:15/7/2025
 */