package Assignment;

//my code

public class ques1 {
    public static boolean checkDuplicate(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j] && i != j)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 21, 32, 2, 17 };
        System.out.println(checkDuplicate(a));
    }
}
