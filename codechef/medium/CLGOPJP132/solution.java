import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);

        int N, M;
        N = scanner.nextInt();
        M = scanner.nextInt();
        
        int ans = 1;
        for( int i = 1; i<=M;i++)
        {
            ans = ans * N;
            
        }
        System.out.println(ans);
        // Update your code below this line.

	}
}
