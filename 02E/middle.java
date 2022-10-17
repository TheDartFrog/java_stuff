import java.util.*; 

public class middle {

	
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
		
		
		System.out.println( "Your middle number is:" );
		
		if (numberOne>numberTwo) 
		{
			if (numberOne>numberThree) //number 1 is greatest
			{
				if (numberThree>numberTwo)
				{
					System.out.println(numberThree);
				}
				else 
				{
					System.out.println(numberTwo);
				}
			}
			else
			{
				System.out.println(numberOne);
			}
		}
		else if (numberOne<numberTwo)
		{
			
			//
			//
			if (numberTwo>numberThree) //number 2 is greatest
			{
				if (numberThree>numberOne)
				{
					System.out.println(numberThree);
				}
				else 
				{
					System.out.println(numberOne);
				}
			}
			else
			{
				System.out.println(numberTwo);
			}
			//
			//
			
		} else {
		
		System.out.println(numberOne);
		
		}
		
	}	

}