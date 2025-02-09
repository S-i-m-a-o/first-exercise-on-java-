//Guilherme Simao 3137464
package Griffith;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		
		//task one 
		
		/*
		 * Here i used the scanner to get with the user the data that i 
		 * needed to complete de task.
		 */
		
		System.out.println("Enter the diameter of the ball in cm:");
		Scanner mydiameter = new Scanner(System.in);
		double diameter = mydiameter.nextDouble();
		
		//had to get the radius to use in the formula 
		double radius = (diameter/2 );
		
		/*
		 * with the data provided by the user i could use the geometric formula of 
		 * the volume of a ball to calculate it
		 */
		
		//formula of the volume of a ball
		 double volume =  ((Math.PI) * Math.pow(radius,3)) * 4.0/3.0;
		 volume = (double)Math.round(volume*100)/100;
		 System.out.println("The volume off the ball is:" + volume+ "cm cubed");
		
		 /*
		  *Here i used the same data provided above to calculate, now with another formula,
		  *the area of the ball 
		  */
		 
		 //formula of the area of a ball
		 double area = 4 * Math.PI * Math.pow(radius,2);
		 area = (double)Math.round(area*100)/100;
		 System.out.println("The area of the ball is :" +area+ "cm squared" );
		  
		 
		 //task two
		 /*
		  * to complete this task i had to change a character to a number based on 
		  * the ASCII decimal code so i can add the number of positions and then 
		  * turn it into a character again 
		  */
		
		 //i used the scanner again here so i could get the data (number of positions)
		 //provided by the user
		 
		 System.out.println(" Enter the amount of positions");
		 Scanner myscannere = new Scanner(System.in);
		 int num_of_positions = myscannere.nextInt();
		 
		 //here the user types a character witch, based on the ASCII decimal code,
		 //is changed to the relative number on the ASCII and is saved as a integer
		 System.out.println("Enter a character to encode");
		 Scanner myscannero = new Scanner(System.in);
		 int letter1 = myscannero.next().charAt(0);
		 
		 //with letter as a decimal number i can add the number of positions the user wants
		 int letter2 =(letter1 + num_of_positions);
		 
		 //and here when im printing it out to the user i can change both letters in decimals
		 //to the relative character by the ASCII code
	     System.out.println((char)letter1 + " encoded is "+(char)letter2);	 
		 
		
		
		 //task 3
		
		 
	     //here i used final double to determinate both constants in liter
		 final double paint = 2.5;
		 final double wall_covered_by_one_liter = 13;
		 
		 //here i ask to the user the width in meters and with the scanner i
		 //can get the data provided by the user 
		 System.out.println("Enter your walls width in meters ");
		 Scanner myscannera= new Scanner(System.in);
		 double width = myscannera.nextDouble();
		 
		 //same idea, but used to get the height of the wall
         System.out.println("Enter your walls height in meters ");
		 Scanner myscanneri = new Scanner(System.in);
		 double height = myscanneri.nextDouble();
		 
		 //here i used a simple formula to calculate the area of the wall
		 //and i print to the user how big is the area he wants to paint
		 double wall = height * width ;
		 System.out.println("The wall is " + wall+"sqm");
		 
		 //here is a simple division, first to know how many liters the user needs 
		 //and than to know how many paints he needs
		 double tins = (wall / wall_covered_by_one_liter)/ paint;
		 tins = (double)Math.ceil(tins);
		 
		 System.out.println("you will need " + tins + " tins of paint");
		 
	
		
		 //task four
		 /*
		  *in task four is the same idea then task 1 and 3,
		  *i just had to ask and use the scanner to get the 
		  *data from the user and save as variables
		  */
		 
		
		 System.out.println("enter the bill amount :");
		 Scanner myBill = new Scanner(System.in);
		  double bill_amount = myBill.nextDouble();
		 
		 System.out.println("Enter the number of people:");
		 Scanner myNum_of_people = new Scanner(System.in);
		 double num_of_people = myNum_of_people.nextDouble();
	
		 System.out.println("Enter service charge (e.g., 15 for 15%):");
		 Scanner myService_charge = new Scanner(System.in);
		 double porcent = myService_charge.nextDouble();
		 
		 //here i used first simple math to determine how much 
		 //would be the total and also provide the information to the user
		 double totalbill = ((bill_amount * porcent)/100)+ bill_amount;
		 System.out.println("Total bill including service charge:"+ totalbill);
		 
		 //and than i divided by the number of people also provide the 
		 //information to the user
		 double totaleach = totalbill / num_of_people;
		 System.out.println("Each Person Should Pay: "+totaleach);
		 
		 
	
		//task five 
		
		/*
		 * from line 141 to 155 i ask all the data that i need to to task 
		 * two and with the scanner i can save then as doubles and integers.
		 */
		 
		 System.out.println("Enter year of birth and month (1-12)");
		 Scanner myYear1 = new Scanner(System.in);
		 double Year1 = myYear1.nextDouble();
		 
		 Scanner myMonth1 = new Scanner(System.in);
		 int Month1 = myMonth1.nextInt();
		 
		 
		 System.out.println("Enter second birth year and month ");
		 Scanner myYear2 = new Scanner(System.in);
		 double Year2 = myYear2.nextDouble();
		 
		 Scanner myMonth2 = new Scanner(System.in);
		 int Month2 = myMonth2.nextInt();
		  
		 //here i multiply the age in years for 12 so i can get how old is both persons 
		 //in months once i add the months as well
		 double Age1months = (Year1*12 + Month1);
		 double Age2months = (Year2*12 + Month2);
		 
		 //here i do one mines the other to see how older he is in months 
		 double Dif = Math.abs(Age2months - Age1months);
		 
		 //than i simple divided by 12 to see in years how long this is 
		 // and use the module of 12 to see how many months older
		 double Year = Dif/12;
		 double Month = Dif%12;
		 
		 System.out.println("the diference is "+(int)Year +" years " + (int)Month + " months.");
		 
		  
		 
		 
		 
		 
		 
		 
		 
	}

}
