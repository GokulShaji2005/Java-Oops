package tutorial_6;

class Car{
    private String model;
    public Car(String model){
        this.model=model;

    }

    public void showModel(){
        System.out.println("Model: "+model);
    }
}

public class CarModel {

    public static void main(String[] args) {
        String model="Maruthi";
        Car c1=new Car(model);
       c1.showModel();
    }
}