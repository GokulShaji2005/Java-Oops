

package module_1;
import java.util.Vector;
public class VectorMammals {
Vector <String> mammals=new Vector<>();

mammals.add("Dog");
mammals.add("Horse");

mammals.add(2,"Cat");
System.out.println("Vector: "+ mammals);

Vector <String> animals=new Vector<>();
animals.add("Crocodile");

animals.addAll(mammals);
System.out.println(animals);

}
