import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int y = 0, x = 0;
            System.out.println("Enter the String");
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'w' || c == 'W')
                    x--;
                else if (c == 'e' || c == 'E')
                    x++;
                else if (c == 'n' || c == 'N')
                    y++;
                else if (c == 's' || c == 'S')
                    y--;
            }
            double d = Math.sqrt((x * x) + (y * y));
            System.out.println("Displacement = " + d);
        }

    }

}
