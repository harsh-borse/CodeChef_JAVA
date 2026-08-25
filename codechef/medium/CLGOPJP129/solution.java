import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// Update the blank given below.
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for(int i = 1; i <= 10; i++){
		    int res = n * i ;
		    System.out.println(n + " x " + i + " = " + res);
		}
	}
}
