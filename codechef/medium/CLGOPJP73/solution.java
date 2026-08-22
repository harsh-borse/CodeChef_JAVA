class Codechef
{
	public static void main (String[] args)
	{
	   // Debug the code given below
	    int age = 25;
        int voting_age = 18;

        if (age < voting_age){
            System.out.println("Not old enough to vote.");
            System.out.println("Wait for " + (voting_age - age) + " years");

        }else {
            System.out.println("Old enough to vote!");
        }
	}
}