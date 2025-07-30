package tutorial_3;

import java.util.Scanner;

public class Maximum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int limit = sc.nextInt();
        int[] numbers = new int[limit];
        System.out.println("The numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
            } else if (numbers[i] <= min) {
                min = numbers[i];
            }
        }

        System.out.println("The maximum number: "+max);
    System.out.println("The minimum number: "+min);

    }

}
