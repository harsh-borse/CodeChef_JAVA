// Debug the code below to solve the problem.
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        int N, sum = 0;
        int i =0 ;
    
        N = scanner.nextInt();

        while ( i <= N) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
	}
}
