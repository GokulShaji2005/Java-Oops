package tutorial_1;
public class PrimeSeries {
        public static void main(String args []){
        int count=0;
      
        int limit=100;
        
    for(int i=2;i<=limit;i++){
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0){
              count++;
            }
      
        }
        if(count==0){
                   System.out.println(i);
        }
        else{
            count=0;
            continue;
        }
    }
}
}
/*
 * author:Gokul Shaji
 * Date:18-7-2025
 */