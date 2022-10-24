/* 

Write a program which reads five numbers of typeintand prints the two greatest ofthem (which can be equal).
You can define at most three variables of typeint.
Do not use loops or arrays. 

*/




import java.util.*; 

public class BudgetNumberComparator {

	
	public static void main(String[] args)
	{
		
		
		Scanner epicScanning = new Scanner(System.in);
		
		int a = 0; //biggest
		int b = 0; //2nd biggest
		int c = 0; //storage var
		
		/////////////////////////////////////////////////////////////
		
		try 
			{
				System.out.println("\nPlease enter your first number:");
				a = epicScanning.nextInt();
				//loopEscaper = false;
			}
		catch (InputMismatchException e)
			{
				System.out.println("\nNot an integer! Program will now exit, please restart to try again..\n"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);
			}
			
			/////////////////////////////////////////////////////////
			
		try 
			{
				System.out.println("\nPlease enter your second number:");
				
				c = epicScanning.nextInt();
				
				if (c>a)
					{
						b = a;
						a = c;
					} 
				else if (c==a)
					{
						b = c;
					}
				else
					{
						b = c;
					}
				
			}
		catch (InputMismatchException e)
			{
				System.out.println("\nNot an integer! Program will now exit, please restart to try again..\n"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);
			}
			
			/////////////////////////////////////////////////////////////
			
		try 
			{
				System.out.println("\nPlease enter your third number:");
				
				c = epicScanning.nextInt();
				
				if (c>a)
					{
						b = a;
						a = c;
					} 
				else if (c==a)
					{
						b = a;
					}
				else if (b<c)
					{
						b = c;
					}
				
			}
		catch (InputMismatchException e)
			{
				System.out.println("\nNot an integer! Program will now exit, please restart to try again..\n"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);
			}
			
			
	/////////////////////////////////////////////////////////////
			
		try 
			{
				System.out.println("\nPlease enter your fourth number:");
				
				c = epicScanning.nextInt();
				
				if (c>a)
					{
						b = a;
						a = c;
					} 
				else if (c==a)
					{
						b = a;
					}
				else if (b<c)
					{
						b = c;
					}
				
			}
		catch (InputMismatchException e)
			{
				System.out.println("\nNot an integer! Program will now exit, please restart to try again..\n"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);
			}
			
	/////////////////////////////////////////////////////////////
			
		try 
			{
				System.out.println("\nPlease enter your fifth number:");
				
				c = epicScanning.nextInt();
				
				if (c>a)
					{
						b = a;
						a = c;
					} 
				else if (c==a)
					{
						b = a;
					}
				else if (b<c)
					{
						b = c;
					}
				
			}
		catch (InputMismatchException e)
			{
				System.out.println("\nNot an integer! Program will now exit, please restart to try again..\n"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);
			}
			
	////////////////////////////////////////////////////////////////
	
		System.out.println("\n\nYour biggest number is: "+a+"\n");
		System.out.print("Your second biggest number is: "+b);
		if (a==b)
		{
			System.out.println(", the same as your biggest one!\n\n");
		}
		
		System.out.println("\n\n\nProgram will exit...\n");
			
		
	}
	
	
}
		