import java.util.ArrayList;

public class TwoPointerApproach {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int max = storeWater(height);
        System.out.println(max);
    }

    public static int storeWater(ArrayList<Integer> height) {
        int p1 = 0, p2 = height.size() - 1, max = 0;
        // System.out.println(p2);
        while (p1 != p2) {
            int curWater = Math.min(height.get(p1), height.get(p2)) * (p2 - p1);
            max = Math.max(max, curWater);
            if (height.get(p1) > height.get(p2)) {
                p2--;
            } else
            p1++;
        }
        return max;
    }
}
