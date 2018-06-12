package Operator;

public class Operatorexample {
 public static void main(String[] args) {
	 int age = 10;
	 int height = 6;
	 String name = "Adif";
	 char firstletterofyourname = 'K';
	 
System.out.println(30+6);
System.out.println(age+height);
System.out.println(age+height+ " is age for "+name);
System.out.println("Details for " + name +" " + (age+height));
System.out.println("Modulus is = "+ (age%height));

//If else statements
System.out.println(age>18);
boolean IsAkid = age<18;
System.out.println("is a kid =" + IsAkid );
System.out.println(!IsAkid);

// if (age >= 18) 
if (!IsAkid) {
System.out.println("You are grown up kid");
 }else 
{
System.out.println("Your are still a kid");
}
 
 // For loop statements
for (int i = 0 ; i <5 ; i++) {
	 System.out.println("Krish is not smart");
 }
	 
 
 }
}






