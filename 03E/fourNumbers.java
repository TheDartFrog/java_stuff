import java.util.*; 

public class fourNumbers {

	
	public static void main(String[] args)
	{
		
		
		Scanner epicScanning = new Scanner(System.in);
		
		boolean loopEscaper = true;
		
		
		int x = 0;
		
		
		int a1 = 2;
		int a2 = 4;
		
		int b1 = 1;
		int b2 = 6;
		
		

		//x number
		while (loopEscaper)
		{
		
			System.out.println("Please enter your number:");
		
			try 
			{
				x = epicScanning.nextInt();
				loopEscaper = false;
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nPlease enter a correct integer!\n"); 
				epicScanning = new Scanner(System.in);
			}
		
		}
		//end of x number
		
		
		System.out.println("\nYour number is: "+x+"\n");
		
		
		///////////////////////////////////////////////
		
		boolean xInA = x>=a1 && x<=a2;
		boolean xInB = x>=b1 && x<=b2;
		boolean xInANotB = xInA && !xInB;
		boolean xInBNotA = xInB && !xInA;
		boolean xInAAndB = xInA && xInB;
		boolean xInAOrB = xInA || xInB;
		boolean xInAOrBNotBoth = xInAOrB && !xInAAndB;
		
		//////////////////////////////////////////////
		
		//////////////////////////////////////////////
		
		System.out.println("x in A:");
		System.out.println(xInA);
		System.out.print("\n");
		
		System.out.println("x in B:");
		System.out.println(xInB);
		System.out.print("\n");
		
		System.out.println("x in A\\B:");
		System.out.println(xInANotB);
		System.out.print("\n");
		
		System.out.println("x in B\\A:");
		System.out.println(xInBNotA);
		System.out.print("\n");
		
		System.out.println("x in intersection of A and B:");
		System.out.println(xInAAndB);
		System.out.print("\n");
		
		System.out.println("x in union of A and B:");
		System.out.println(xInAOrB);
		System.out.print("\n");
		
		System.out.println("x in symm. diff. of A and B:");
		System.out.println(xInAOrBNotBoth);
		
		//////////////////////////////////////////////
		
	}
	
}