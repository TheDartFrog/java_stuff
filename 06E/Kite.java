import java.util.*; 

public class Kite {

	
	public static void main(String[] args)
	{
		
	System.out.print("\n\n\n\n\n");
	
	int currentRow = 0;
	int userInput = 0;
	int loopingNumber = 0;
	int rowSpaces = 0;
	int rowStars = 0;
	
	boolean isEven = false;
	
	Scanner epicScanning = new Scanner(System.in);
	boolean loopEscaper = true;
	
	//input number ////////////////////////////////////////////////////////
		while (loopEscaper)
		{
		
			System.out.println("\nPlease enter your number:");
		
			try 
				{
					userInput = epicScanning.nextInt();
					loopEscaper = false;
				}
			catch (InputMismatchException e)
				{
					System.out.println("\nPlease enter a correct integer!\n"); 
					epicScanning = new Scanner(System.in);
				}
			
			isEven = userInput %2 == 0;
			
			if (isEven == true || userInput<=0)
				{
					System.out.println("\nPlease enter an odd number larger than 0!\n"); loopEscaper = true;
				}
		}
	//end of input number //////////////////////////////////////////////////
	
	loopingNumber = userInput;
	
	System.out.print("\n\n\n\n");
	
	while(currentRow<=userInput/2+1)
	{
		do
		{
			if (userInput-2*currentRow>=0)
			{
				if(rowSpaces<currentRow)
				{
					System.out.print(" "); rowSpaces++;
				}
				else if (rowSpaces+rowStars<userInput-currentRow)
				{
					System.out.print("*"); rowStars++;
				}
				//loopingNumber--;
			}
			loopingNumber--;
		}while (loopingNumber>0);
	currentRow++;
	rowSpaces = 0;
	rowStars = 0;
	loopingNumber = userInput;
	System.out.print("\n");
	//System.out.println(currentRow);
	}
	
	
	
	
	
	
	
	
	}
	
}