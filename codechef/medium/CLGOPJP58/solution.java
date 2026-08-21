import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int f = 49;
        float c = (float)((f - 32) * 5) / 9; // Ensure that the division is performed with float
        System.out.println(c);
    }
}
