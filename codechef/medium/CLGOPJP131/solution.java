import java.util.Scanner;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;


        }
        System.out.println(fact);
        //  Write your code here

    }
}