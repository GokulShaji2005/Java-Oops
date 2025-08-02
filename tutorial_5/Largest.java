package tutorial_5;

import java.util.Vector;

public class Largest {
    public static void main(String[] args) {
        Vector <Integer> numbers=new Vector<>();
     
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        

        for(int i:numbers){
System.out.print(i+" ");

        }
        System.out.print("\n");

        
           int max=numbers.get(0);
        
        for(int i=0;i<numbers.size();i++){
          if(numbers.get(i)>max){
           max=numbers.get(i);
          }
        }
       
        System.out.println("The largest number is:"+max);
    
}
}
