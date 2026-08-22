import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
	   // Update the blanks in the code given below
		Scanner read = new Scanner(System.in);

        int z;
        int x;
        int c;
        z = read.nextInt();
        x = read.nextInt();
        c = read.nextInt();
        if (c > x || c > z) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        z = read.nextInt();
        x = read.nextInt();
        c = read.nextInt();
        if (c > x || c > z) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
	}
}