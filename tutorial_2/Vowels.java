package tutorial_2;
// import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
public class Vowels{
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter:");
        char letter=sc.next().charAt(0);

        
        String name;
        switch(Character.toLowerCase(letter)){
            case 'a':case 'e':  case 'i':case 'o':   case 'u': name="Vowel";
            break;
            default:name="Consanance";
            break;


        };

        System.out.println(letter+" is a "+name);
    }
}
/*
 author:Gokul Shaji
 Date:24/7/2025
 */
