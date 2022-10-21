import java.util.*; 

public class TriangleCheck {

	
	public static void main(String[] args)
	{
		
		Scanner epicScanning = new Scanner(System.in);
		
		
		boolean loopEscaper = true;
		int numberOne = 0;
		int numberTwo = 0;
		int numberThree = 0;
		
		
		
		//first number
		while (loopEscaper)
		{
		
			System.out.println("Please enter your first number:");
		
			try 
			{
				numberOne = epicScanning.nextInt();
				loopEscaper = false;
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nPlease enter a correct integer!\n"); 
				epicScanning = new Scanner(System.in);
			}
		
		}
		//end of first number
		
		
		
		loopEscaper = true;
	
	
	
		//second number
		while (loopEscaper)
		{
		
			System.out.println("Please enter your second number:");
		
			try 
			{
				numberTwo = epicScanning.nextInt();
				loopEscaper = false;
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nPlease enter a correct integer!\n"); 
				epicScanning = new Scanner(System.in);
			}
		
		}
		//end of second number
		
		
		
		loopEscaper = true;
		
		
		
		//third number
		while (loopEscaper)
		{
		
			System.out.println("Please enter your third number:");
		
			try 
			{
				numberThree = epicScanning.nextInt();
				loopEscaper = false;
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nPlease enter a correct integer!\n"); 
				epicScanning = new Scanner(System.in);
			}
		
		}
		//end of third number
		
		
		
		System.out.println("\n\nYour Numbers:\n" + numberOne );
		System.out.println( numberTwo );
		System.out.println( numberThree + "\n" );
		
		
		///////////////////////////////////////////////////////////////////
		
		
		if (numberOne+numberThree>numberTwo && numberOne+numberTwo>numberThree && numberTwo+numberThree>numberOne)
		{
			
			System.out.println("This is a triangle!");
			
		}
		else
		{
			
			System.out.println("This is NOT a triangle!");
			
		}
		
	}	

}