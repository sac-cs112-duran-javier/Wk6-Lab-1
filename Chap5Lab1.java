//Using If statement to implement Guess-a-number game
import java.util.Scanner;

public class Chap5Lab1 

{
	
	public static void main (String [] args)
	
	{
		
		Scanner in =new Scanner(System.in);
			
		int x;
		int guess;

			System.out.println("Guess a number:  ");
			guess = in.nextInt();
			
			
			{
		if ( guess >10  || guess <1 )
			{	System.out.println (" Invalid number, program crashes. Please pick between 1-10");
				System.exit(0);
				
			}		
		
		x =0 + (int) (Math.random() *10);
		System.out.println(x);	
		
		if ( x == guess)
			System.out.println("You guessed it right.");
}
	}
}