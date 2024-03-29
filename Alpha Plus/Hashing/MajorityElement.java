import java.util.HashMap;

class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1,3,3 };
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int elem : arr) {
            // if (hm.containsKey(elem)) {
            //     hm.put(elem, hm.get(elem) + 1);
            // } else {
            //     hm.put(elem, 1);
            // }
            hm.put(elem,hm.getOrDefault(elem, 0)+1);//instead of uppar wali line write in one line like this
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) > arr.length/3) {
                System.err.println(key);
            }
        }

    }
}