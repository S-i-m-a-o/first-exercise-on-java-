//Guilherme Simao 3137464
package Griffith;

public class Address {
	
	//declaring attributes 
	private String streetname;
	private String Eircode;
	private String city;
    private String town;
    private Location location; //composition
    
    //construction with composition
    public Address( String streetname, String Eircode, String city,
    		String town, Location location) {
    	
    	this.streetname = streetname;
    	this.Eircode = Eircode;
    	this.city = city;
    	this.town = town;
    	this.location = location;
    	
    }
    
    //getters and setters
    public String gettown() {
    	
    	return town;
    }
    

    public String getcity() {
    	
    	return city;
    }



	public String getEircode() {
		
		return Eircode;
	}
	
	public String getstreetname() {
		
		return streetname;
	}
	
	
	public Location getLocation() {
		return location;
	}
    
    
    		
    		
}
