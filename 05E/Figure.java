import java.util.*; 

public class Figure {

	
	public static void main(String[] args)
	{
		
		
		Scanner epicScanning = new Scanner(System.in);
		
		String mode = "";
		
		boolean chooseRand = false;
		
		boolean loopEscaper = true;
		
		double area = 0;
		
		double dee = 0;
		
		/////
		Random rand = new Random();
		
		int minRange = 0, maxRange= 2;
        int value = rand.nextInt(maxRange - minRange) + minRange;
		/////
		
		System.out.println("\n\n\nWelcome!");
		
		////////////////////////////////////////////////////////////////////////////
		while(loopEscaper)
		{		
			System.out.println("\n\nPlease input your figure from these options:\n\n> disc\n> triangle\n> square\n> rand");
	
			try 
				{
					mode = epicScanning.next();
				
					epicScanning = new Scanner(System.in);
				}
			catch (InputMismatchException e)
				{
					System.out.println("\nUnexpected error occured! Program will now exit, please restart to try again.."); 
					epicScanning = new Scanner(System.in);
					System.exit(0);
				}
				
			if (mode.equals("disc") || mode.equals("triangle") || mode.equals("square") || mode.equals("rand"))
			{
				
				System.out.println(mode);
				loopEscaper = false;
				
			} else {System.out.println("\n\n\n\n\nFigure \""+ mode +"\" does not exist!\nPlease try again..");}
		}
		//////////////////////////////////////////////////////////////////////////////
		loopEscaper = true;
		//////////////////////////////////////////////////////////////////////////////
		
		while (loopEscaper)
		{
		
			System.out.println("Please enter your number:");
		
			try 
			{
				dee = epicScanning.nextInt();
				loopEscaper = false;
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nPlease enter a correct integer!\n"); 
				epicScanning = new Scanner(System.in);
			}
		
		}
		
		
		//////////////////////////////////////////////////////////////////////////////
		
		
		
		////////////////////////////
		
		do{ 
			if (chooseRand)
			{
				switch (value)
				{
					case 0 -> mode = "disc";
					case 1 -> mode = "triangle";
					case 2 -> mode = "square";
					default -> throw new IllegalStateException("a stinky has occured! error code 01");
				};
				
				chooseRand = false;
				
			}
			switch (mode) 
			{
				case "disc" -> area = Math.PI*dee*dee;
				case "triangle" -> area = Math.sqrt(3) * dee*dee / 4;
				case "square" -> area = dee*dee;
				case "rand" -> chooseRand = true;
				default -> throw new IllegalStateException("a stinky has occured! error code 02");
			};
			
		}while(mode.equals("rand"));
		
		
		
		////////////////////////////
		
		
		switch (mode) 
			{
				case "disc" -> System.out.println("The area of your disc is: " + area);
				case "triangle" -> System.out.println("The area of your triangle is: " + area);
				case "square" -> System.out.println("The area of your square is: " + area);
				//case "rand" -> chooseRand = true;
				default -> throw new IllegalStateException("a stinky has occured! error code 03");
			};
	
	}
	
}




		