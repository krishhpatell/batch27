package arrayexample;

public class Arrayexample2D {
	public static void main(String[] args) {
		
	
	String nameA[] = {"Tom","Hank"};
	String nameB[] = {"Raju","Singh"};
	String nameC[] = {"Black","Panther"};
	String nameD[] = {"Bill","Rod"};
	String nameE[] = {"Mohan","Taka"};
	String nameF[] = {"Rakesh","Lal","Pitamber"};
	String names[][] = {nameA,nameB,nameC,nameD,nameE,nameF};
	//System.out.println("First Name is :  "+ names[0][0]+" , Last Name is  : "+ names[0][1]);
	for (int i=0; i<names.length; i++)
	{
		String name[] = names[i];
	//System.out.println(name[0]+"  "+name[1]);
	 for (int j = 0; j <name.length;j++)
		{System.out.print(names[i][j] +" "); 
	}
	System.out.println(" ");
	}
}
}


	
	
	


	
	
	