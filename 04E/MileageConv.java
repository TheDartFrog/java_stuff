








import java.util.*; 

public class MileageConv {

	
	public static void main(String[] args)
	{
		
		
		Scanner epicScanning = new Scanner(System.in);
		
		
		
		String mode = "";
		
		
		double mile = 1.609344;
		
		double gallon = 3.785412;
		
		double input = 0;
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWelcome!\nPlease select input mode:\n\n-\"eu\" --- European Format, Liters per 100 kilometers..\n-\"usa\" --- American Format, Miles per Gallon..\n");
		
		try 
			{
				mode = epicScanning.nextLine();
			}
		catch (InputMismatchException e)
			{
				System.out.println("\nUnexpected error occured! Program will now exit, please restart to try again..\n"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);
			}
			
			//////////////////////////////////////////////////////////////////////////
			
		try 
			{
				System.out.println("\nPlease enter your Mileage:");
				input = epicScanning.nextDouble();
				//loopEscaper = false;
			}
		catch (InputMismatchException e)
			{
				System.out.println("\nNot a valid number! Program will now exit, please restart to try again..\nTIP: if using a comma for the fraction doesn't work, try using a dot \".\" instead, or vice versa!"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);
			}
			
			/////////////////////////////////////////////////////////////////////////
			
			switch(mode)
			{
				//////////////
				case "usa":
				System.out.println("USA"); 
				break;
				//////////////
				
				//////////////
				case "eu":
				System.out.println("EU"); 
				break;
				//////////////
				
				//////////////
				default:
				System.out.println("\nUnknown mode entered! Program will now exit, please restart to try again..\n"); 
				epicScanning = new Scanner(System.in);
				System.exit(0);				
			}
			
		
	}
	
}