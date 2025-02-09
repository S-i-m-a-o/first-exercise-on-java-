//Guilherme Simao 3137464
package Griffith;

public class Building {
	
	//declaring 
	private Address address; //composition
	
	//constructor with composition
	public Building( Address address) {
		
		this.address = address;
	}
	
	//getters and setters
	 public Address getAddress() {
	    	
			return address;
			}
	 
	 //method to display info
	 public void getInfo() {
	        System.out.println("Street Name:" + address.getstreetname());
	        System.out.println("Eircode: " + address.getEircode());
	        System.out.println("Localização: Lat " + address.getLocation().getLatitude() + " Long " + address.getLocation().getLongitude());
	    }

	 

}
