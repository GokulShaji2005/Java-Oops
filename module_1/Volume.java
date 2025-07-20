package module_1;
class Box{
    double height;
    double width;
    double depth;
}
public class  Volume{
    public static void main(String args[]){

        Box box1=new Box();
        double vol;
       box1.height=10;
       box1.width=20;
     box1.depth=30;
     

      vol=box1.height*box1.width*box1.depth;

      System.out.println("The volume is "+vol);
    }
    


}
