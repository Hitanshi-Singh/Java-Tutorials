import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Varanasi");
        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Hyderabad");
        //using Iterator
        Iterator i = cities.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
        //using advanced for loop
        for(String city : cities){
            System.out.println(city);
        }
    }
}
