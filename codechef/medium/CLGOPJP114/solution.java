// Debug the code
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int N, M;

        N = scanner.nextInt();
        M = scanner.nextInt();

        int result = (N*2) + (M*4);
        System.out.println(result);

        scanner.close();
    }
}
