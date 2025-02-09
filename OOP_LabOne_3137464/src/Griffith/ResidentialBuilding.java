//Guilherme Simao 3137464
package Griffith;

public class ResidentialBuilding extends Building {
	
	// declaring attributes
	private String buildingNumber;
    private String buildingName;
    
    //constructor 
	public ResidentialBuilding(Address address,String buildingNumber,String buildingName) {
		
		super(address); //calling father class
		this.buildingNumber = buildingNumber;
		this.buildingName = buildingName;
	}
	
	//constructor for bildings with no name 
	public ResidentialBuilding(Address address,String buildingNumber) {
		 super(address);
		 this.buildingNumber = buildingNumber;
	}
	
	//method to display info
	public void getInfo() {
        super.getInfo(); 
        System.out.println("Building Name: " + buildingName + "Building Number:" + buildingNumber);
    }

}
