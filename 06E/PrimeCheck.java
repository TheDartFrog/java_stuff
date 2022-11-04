

import java.util.*; 

public class PrimeCheck {

	
	public static void main(String[] args)
	{
	
		Scanner epicScanning = new Scanner(System.in);
		boolean loopEscaper = true;
		
		int userNumber = 0;
		
		boolean checkerStop = false;
		int checkerNumber = 0;
		
		boolean isItPrime = false;
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		
	//first number ////////////////////////////////////////////////////////
		while (loopEscaper)
		{
		
		System.out.println("\nPlease enter your number:");
		
		try 
		{
		userNumber = epicScanning.nextInt();
		loopEscaper = false;
		}
		catch (InputMismatchException e)
		{
					System.out.println("\nPlease enter a correct integer!\n"); 
					epicScanning = new Scanner(System.in);
		}
		
		}
	//end of first number ////////////////////////////////////////////////////////
		checkerNumber = userNumber-1;
	////////////////////////////////////////////////
		
		while(userNumber > 1 && checkerNumber > 1)
		{
			loopEscaper = userNumber % checkerNumber == 0;
			if (loopEscaper == false)
			{
				
			//System.out.println("bruh");
				
			checkerNumber--;
			isItPrime = true;
				
			} else {
				
			isItPrime = false;
			checkerNumber = 0;
			
			}
			
		}
		
	////////////////////////////////////////////////
		
		if (isItPrime)
		{
			
			System.out.println("\n\n"+userNumber+" is prime!");
			
		} else {
			
			System.out.println("\n\n"+userNumber+" is NOT prime!");
			
		}
		
	}
	
}