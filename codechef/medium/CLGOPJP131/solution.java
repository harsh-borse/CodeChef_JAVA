import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N;
        N = scanner.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= N; i++) {
            System.out.println(a + " ");

            int next = a + b;
            a = b;
            b = next;


        }

    }
}