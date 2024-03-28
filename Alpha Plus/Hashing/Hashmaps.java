import java.util.*;

class Hashmaps {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();
        // inserting
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 60);
        System.out.println(hm);
        // get - O(1)

        System.out.println(hm.get("India")); // prints value for key - India
        System.out.println(hm.get("Indonesia"));// null becoz key doesn't exist

        // containsKey - O(1)
        System.out.println(hm.containsKey("India"));// true
        System.out.println(hm.containsKey("Indonesia")); // false

        // remove
        System.out.println(hm.remove("China")); // returns value of china and deletes it
        System.out.println(hm);
        System.out.println(hm.remove("Chile"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty()); // returns false since the map is not empty

        //clear
        hm.clear(); // this made the map empty
        System.out.println(hm.isEmpty());
    }
}