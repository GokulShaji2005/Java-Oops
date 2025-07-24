<<<<<<< HEAD
package lab1;
import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,reverse=0;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        for(int i=0;i<num;i++){
            int remain=num%10;
             reverse =reverse*10+remain;
            num=num/10;
        }
        System.out.println(reverse);

    }
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
=======
package lab1;
import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,reverse=0;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        for(int i=0;i<=num;i++){
            int remain=num%10;
             reverse =reverse*10+remain;
            num=num/10;
        }
        System.out.println(reverse);

    }
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
>>>>>>> 7ea54ec (added Volume)
 */