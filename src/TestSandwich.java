import javax.swing.JOptionPane;

public class TestSandwich {

	public static void main(String[] args) {
		
		//Instantiate a Sandwich object
		Sandwich megaSandwich = new Sandwich();
		Sandwich bigSandwich = new Sandwich();
		
		//Set the values of fields in megaSandwich
		megaSandwich.setMainIngred("pepperoni");
		megaSandwich.setBreadType("white");
		megaSandwich.setPrice(10.00);
		
		//Output the info of megaSandwich
		String customer;
		customer = JOptionPane.showInputDialog("Who wants a mega sandwich? ");
		JOptionPane.showMessageDialog(null, customer + " wants a " + megaSandwich.getMainIngred() +
				" sandwich with " + megaSandwich.getBreadType() + " bread. This will cost $" + 
				megaSandwich.getPrice() + " dollars.");
		 
		//Set the values of fields in bigSandwich
		bigSandwich.setMainIngred("salami");
		bigSandwich.setBreadType("whole wheat");
		bigSandwich.setPrice(8.00);
		
		//Output the info of bigSandwich
		customer = JOptionPane.showInputDialog("Who wants a big sandwich? ");
		JOptionPane.showMessageDialog(null, customer + " wants a " + bigSandwich.getMainIngred() +
				" sandwich with " + bigSandwich.getBreadType() + " bread. This will cost $" + 
				bigSandwich.getPrice() + " dollars.");
		 
	}

}
