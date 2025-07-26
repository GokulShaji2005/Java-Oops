package module_1;
import java.util.*;
public class ArrayClass {
    public static void main(String args[]){
        int [] numbers=new int[10];
   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms:");
        int limit=sc.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0;i<limit;i++){
            numbers[i]=sc.nextInt();
        }
System.out.println("Array length = "+limit);
    
        
        Arrays.sort(numbers);
         int key=2;
        System.out.println(Arrays.binarySearch(numbers, key));
    }
    
}
