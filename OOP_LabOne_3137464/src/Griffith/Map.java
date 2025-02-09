//Guilherme Simao 3137464
package Griffith;

import java.util.Scanner;

public class Map {
	
	//Method to calculate distance using the latitude and longitude
	
	public double distanceCalculator(Location first, Location second) {
		
		//earth radius to calculate distance considering the Earth's circumference
		final double earthRadius = 6371;
		
		//getting latitudes and longitudes in radians to use in formula 
		double lat1 = Math.toRadians(first.getLatitude());
		
		double long1 = Math.toRadians(first.getLongitude());
		
		double lat2 = Math.toRadians(second.getLatitude());
		
		double long2 = Math.toRadians(second.getLongitude());
		
		//difference of latitudes and longitudes to get distance
		double diffLat = lat2 - lat1;
		
		double diffLon = long2 - long1;
		
		 // Fórmula de Haversine
        double a = Math.sin(diffLat / 2) * Math.sin(diffLat / 2)
                 + Math.cos(lat1) * Math.cos(lat2)
                 * Math.sin(diffLon / 2) * Math.sin(diffLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        
        return earthRadius * c;
		
		
		
		
		
	}

	//method to compare latitude and longitude inputed from the user with the objects
	 public static boolean comparareLocation(Location loc, double lat, double lon, double margemErro) {
	     
	        boolean latCorrect = Math.abs(loc.getLatitude() - lat) <= margemErro; 
	        boolean lonCorrect = Math.abs(loc.getLongitude() - lon) <= margemErro;


	        return latCorrect && lonCorrect;
	    }

	public static void main(String[] args) {
		
		//calling scanner
		Scanner scanner = new Scanner(System.in);
		
		//creating objects
		Location Loc1 = new Location (53.3376423, -6.2626069);
		Address Add1 = new Address("80 Harcourt ST", "D02 F449", "Dublin 02",
    		"Dublin", Loc1);
		Building B1 = new Building(Add1); 
		CommercialBuilding CB1 = new CommercialBuilding(Add1, "HWBC Ltd", "10 to 17:30", "hwbc.ie");
		
		Location Loc3 = new Location (53.33306, -6.24889);
		Address Add3 = new Address("164 Shelbourne Rd", "D04 HH60", " Ballsbridge",
    		"Dublin", Loc3);
		Building B3 = new Building(Add3); 
		CommercialBuilding CB2 = new CommercialBuilding(Add3, "cushman e wakefield", "9 to 17:30", "www.cushmanwakefield.com");
		
		Location Loc4 = new Location (53.340310, -6.243200);
		Address Add4 = new Address("15 Hogan Pl", "D02 DK23", " Dublin 2",
    		"Dublin", Loc4);
		Building B4 = new Building(Add4); 
		CommercialBuilding CB3 = new CommercialBuilding(Add4, "Cosgrave Developments Limited", "9 to 17", "http://www.cosgravegroup.ie/");
		
		Location Loc2 = new Location ( 53.3441352, -6.2669948);
		Address Add2 = new Address("Dame St", "D02 RY92", "Dublin 02",
	    		"Dublin", Loc2);
		Building B2 = new Building(Add2); 
		ResidentialBuilding RB1 = new ResidentialBuilding(Add2,"10","Parliament Buildings");
		
		Location Loc5 = new Location ( 53.334300, -6.282710);
		Address Add5 = new Address("Hamilton St", "D08 NY26", "Portobello",
	    		"Dublin", Loc5);
		Building B5 = new Building(Add5); 
		ResidentialBuilding RB2 = new ResidentialBuilding(Add5,"35","Casa Viking");
		
		Location Loc6 = new Location ( 53.333050, -6.258810);
		Address Add6 = new Address("Earlsfort Terrace", "D02 E277", "Dublin2",
	    		"Dublin", Loc6);
		Building B6 = new Building(Add6); 
		ResidentialBuilding RB3 = new ResidentialBuilding(Add6,"22","Earlsforth House");

		//display menu 
		System.out.println("menu:");
		System.out.println("1. Get a building by its Eircode");
		System.out.println("2. Get a Building's Eircode by coordinates.");
		System.out.println("3. Get distance between two buildings");
		System.out.println("4. Quit");
		System.out.println("Enter your choice:");
		
		//get user choice 
		Scanner choice = new Scanner(System.in);
		int var = (int) choice.nextDouble();
		
		//if conditions to work with user input
		if(var==1)
		{
			System.out.print("enter Eircode:");
			String eircodeInput = scanner.nextLine();
			
			//if conditions to compare user input with objects, when the condition is true information of the object is displayed
			if (eircodeInput.equalsIgnoreCase(RB1.getAddress().getEircode())) {
	            System.out.println("The Residential Building is:");
	            RB1.getInfo();
	        }
			else if (eircodeInput.equalsIgnoreCase(RB2.getAddress().getEircode())) {
	            System.out.println("The Residential Building is:");
	            RB2.getInfo();
	        }
			else if (eircodeInput.equalsIgnoreCase(RB3.getAddress().getEircode())) {
	            System.out.println("The Residential Building is:");
	            RB3.getInfo();
	        }
			else if (eircodeInput.equalsIgnoreCase(CB1.getAddress().getEircode())) {
	            System.out.println("The Commercial Building is:");
	            CB1.getInfo();
	        }
			else if (eircodeInput.equalsIgnoreCase(CB2.getAddress().getEircode())) {
	            System.out.println("The Commercial Building is:");
	            CB2.getInfo();
	        }
			else if (eircodeInput.equalsIgnoreCase(CB3.getAddress().getEircode())) {
	            System.out.println("The Commercial Building is:");
	            CB3.getInfo();
	        }
			else
			{
	            System.out.println("No Building Founded.");
	        }
			
		}
		else if(var==2)
		{
			//getting latitude and longitude from user
			System.out.print("Enter latitude:");
			double userLatitude = scanner.nextDouble();
			
			System.out.print("Enter longitude:");
			double userLongitude = scanner.nextDouble();
			 
			 final double margemErro = 0.0001;
			 
			 //compare user imput with objects and if boolean is true display info 
			 if (comparareLocation(RB1.getAddress().getLocation(), userLatitude, userLongitude, margemErro)) {
		            System.out.println("Eircode: " + RB1.getAddress().getEircode());
		        }

			 else if (comparareLocation(RB2.getAddress().getLocation(), userLatitude, userLongitude, margemErro)) {
		            System.out.println("Eircode: " + RB2.getAddress().getEircode());
		        }

			 else if (comparareLocation(RB3.getAddress().getLocation(), userLatitude, userLongitude, margemErro)) {
		            System.out.println("Eircode: " + RB3.getAddress().getEircode());
		        }
			 else if (comparareLocation(CB1.getAddress().getLocation(), userLatitude, userLongitude, margemErro)) {
		            System.out.println("Eircode: " + CB1.getAddress().getEircode());
		        } 
			 else if (comparareLocation(CB2.getAddress().getLocation(), userLatitude, userLongitude, margemErro)) {
		            System.out.println("Eircode: " + CB2.getAddress().getEircode());
		        } 
			 else if (comparareLocation(CB3.getAddress().getLocation(), userLatitude, userLongitude, margemErro)) {
		            System.out.println("Eircode: " + CB3.getAddress().getEircode());
		        } 
			 else {
		            System.out.println("No buildings found");
		        }
	
		}
		else if(var==3)
		{
			//creating objects to store values to use on method 
			Location correctLocation1 = new Location(0, 0);
			Location correctLocation2 = new Location(0,0);
			
			//getting input from user 
			System.out.print("Enter Eircode of first building:");
			String firstEircode = scanner.nextLine();
			
			System.out.print("Enter Eircode of second building:");
			String secondEircode = scanner.nextLine();
			
			//if conditions to compare user input and store values in the new object to use in the method
			if(firstEircode.equalsIgnoreCase(RB1.getAddress().getEircode()))
			{
			 correctLocation1 = RB1.getAddress().getLocation();
			}
			else if(firstEircode.equalsIgnoreCase(RB2.getAddress().getEircode()))
			{
			 correctLocation1 = RB2.getAddress().getLocation();
			}
			else if(firstEircode.equalsIgnoreCase(RB3.getAddress().getEircode()))
			{
			 correctLocation1 = RB3.getAddress().getLocation();
			}
			else if(firstEircode.equalsIgnoreCase(CB1.getAddress().getEircode()))
			{
				 correctLocation1 = CB1.getAddress().getLocation();
			}
			else if(firstEircode.equalsIgnoreCase(CB2.getAddress().getEircode()))
			{
				 correctLocation1 = CB2.getAddress().getLocation();
			}
			else if(firstEircode.equalsIgnoreCase(CB3.getAddress().getEircode()))
			{
				 correctLocation1 = CB3.getAddress().getLocation();
			}
			else if(secondEircode.equalsIgnoreCase(RB1.getAddress().getEircode()))
			{
			 correctLocation2 = RB1.getAddress().getLocation();
			}
			else if(secondEircode.equalsIgnoreCase(RB2.getAddress().getEircode()))
			{
			 correctLocation2 = RB2.getAddress().getLocation();
			}
			else if(secondEircode.equalsIgnoreCase(RB3.getAddress().getEircode()))
			{
			 correctLocation2 = RB3.getAddress().getLocation();
			}
			else if(secondEircode.equalsIgnoreCase(CB1.getAddress().getEircode()))
			{
				 correctLocation2 = CB1.getAddress().getLocation();
			}
			else if(secondEircode.equalsIgnoreCase(CB2.getAddress().getEircode()))
			{
				 correctLocation2 = CB2.getAddress().getLocation();
			}
			else if(secondEircode.equalsIgnoreCase(CB3.getAddress().getEircode()))
			{
				 correctLocation2 = CB3.getAddress().getLocation();
			}
			
			//method to calculate distance 
			Map map = new Map();
			double answer =map.distanceCalculator(correctLocation1, correctLocation2);
			System.out.print( answer + "km" );
			
		}
		else 
		{
			System.out.print("Good Bye");
		}
		
		
	
		
	}

}
