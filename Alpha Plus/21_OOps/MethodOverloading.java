public class MethodOverloading {

    public static void main(String[] args) {
        Calculate c = new Calculate();
        System.out.println(c.sum(5, 9));
        System.out.println(c.sum((float) 2.3, (float) 5.9));
        System.out.println(c.sum(2, 3, 4));
    }
}

class Calculate {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}