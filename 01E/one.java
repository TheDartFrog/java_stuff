import java.util.*;  
import java.nio.charset.Charset;




public class one {

	
	public static void main(String[] args)
	{
		
		Random rand = new Random();
		
		int minRange = 2137, maxRange= 69000;
        int value = rand.nextInt(maxRange - minRange) + minRange;
		System.out.println("\nWELCOME!!\n\n[1]\n\nGenerating random number...");
		System.out.println(value);
		
		System.out.println("\nConverting to binary...");
		
		System.out.println(Integer.toBinaryString(value));
		
		System.out.println("\nConverting to octal...");
		
		System.out.println(Integer.toOctalString(value));
		
		System.out.println("\nConverting to hexadecimal...");
		
		System.out.println(Integer.toHexString(value));
		
		System.out.println("\nDONE..");
		
		System.out.println("\n[2]");
		
		char aaaaaa = 'A';
		
		System.out.println(aaaaaa+0);
		
		System.out.println("\n[3]\n\n");
		
		
		/* System.out.println(System.getProperty("file.encoding")); */
		
		System.out.print('Ż');
		System.out.print('ó');
		System.out.print('ł');
		System.out.print('ć');
		
		System.out.println("\n\n[4]\n");
		
		boolean boolA = true;
		boolean boolB = false;
		
		System.out.println(boolA && boolB);
		System.out.println(boolA || boolB);
		System.out.println(boolA ^ boolB);
		
		System.out.println("\n[6]\n\n");
		
		double threefourths = 4 / 3;
		
		System.out.println(threefourths);
	
	}


}