 package tutorial_6;
 class Animal {
String species;

Animal(String species){
    this.species=species;
}

void displaySpecies(){
    System.out.println("Species: "+species);
}
    
}

public class AnimalDemo {

    public static void main(String[] args) {
        String species="Tiger";
        Animal a1=new Animal(species);
        a1.displaySpecies();
    }
}
