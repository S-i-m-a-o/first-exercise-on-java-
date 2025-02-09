//Guilherme Simao 3137464
package Griffith;

public class CommercialBuilding extends Building {
	
	// declaring attributes
	private String commercialName;
	private String openingHours;
	private String siteURL;
	
	//constructor 
	public CommercialBuilding(Address address,String commercialName,String openingHours, String siteURL) {
		
		super( address); //calling father class
		this.commercialName = commercialName;
		this.openingHours = openingHours;
		this.siteURL = siteURL;
	}
	
	//method to display info
	public void getInfo() {
        super.getInfo(); 
        System.out.println("Commercial Name: " + commercialName + " Opening Hors:" + openingHours + " The Site is:" + siteURL);
    }
	



}
