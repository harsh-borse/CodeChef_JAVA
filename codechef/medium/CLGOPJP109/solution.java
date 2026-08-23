import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        // Read input values
        a = scanner.nextInt();
        b = scanner.nextInt();

        if ((a + b + (a * b)) == 111) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
