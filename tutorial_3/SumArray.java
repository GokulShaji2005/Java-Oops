package tutorial_3;
import java.util.Scanner;
public class SumArray {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int limit = sc.nextInt();
        int[] numbers = new int[limit];
        int count=0;
        System.out.println("The numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum=0;

  for (int i = 0; i < numbers.length; i++) {
           sum=sum+numbers[i];
           count++;
        }

        float avg=((float) sum/count);
            System.out.println("The sum : "+sum);
            System.out.println("The average : "+avg);
}
}