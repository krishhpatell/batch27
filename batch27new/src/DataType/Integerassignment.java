package DataType;

public class Integerassignment {
	
public static void main(String[] args) {
// Convert celsius to fahrenheit
		int Cel = 26;
		// C to F
		int ConvC;
		ConvC = (int) ((1.8*Cel)+32);
		System.out.println(ConvC +" F");

// Convert Fahernheit to Celcius
		int Fah = 78;
		// C to F
		int ConF;
		ConF = (int) ((Fah-32)*0.5556);
		System.out.println(ConF +" C");
		
// Convert KGs to LBs
				int KGs = 52;
				int Convkg;
				Convkg = (int) (2.2*KGs);
				System.out.println(Convkg +" LBs");
				
// Convert LBs to KGs
				int LBs = 115;
				int Convlbs;
				Convlbs = (int) (LBs*0.45359237);
				System.out.println(Convlbs +" KGs");
			
				
	}

}
