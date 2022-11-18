import java.util.*; 

public class SussySwap {

	
	public static void main(String[] args)
	{
		
		int[] bruhRay;
		
		bruhRay = new int[5];
		
		bruhRay[0] = 1;
		bruhRay[1] = 2;
		bruhRay[2] = 3;
		bruhRay[3] = 4;
		bruhRay[4] = 5;
		int rayTemp = 0;
		
		System.out.println(java.util.Arrays.toString(bruhRay)); 
		
		rayTemp = bruhRay[0];
		bruhRay[0] = bruhRay[4];
		bruhRay[4] = rayTemp;
		
		System.out.println(java.util.Arrays.toString(bruhRay)); 
	}
	
}