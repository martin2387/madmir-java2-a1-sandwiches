
public class Sandwich {
	
	//Declare fields for this Object
	static String mainIngred;
	static String breadType;
	static double price;
	
	//Declare access methods
	public String getMainIngred() {
		return mainIngred;
	}
	
	public String getBreadType() {
		return breadType;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Declare mutator methods
	public void setMainIngred(String newMainIngred) {
		mainIngred = newMainIngred;
	}
	
	public void setBreadType(String newBreadType) {
		breadType = newBreadType;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}	 

}
