package tutorial_2;
 import java.util.*;
public class OddNumbers {
    public static void main(String args []){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);

        int limit=sc.nextInt();
        for(int i=1;i<=limit;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");

        };

    }
}
/*
 author:Gokul Shaji
 Date:24/7/2025
 */