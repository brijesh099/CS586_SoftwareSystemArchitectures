/**
 * 
 */
package strategy.DisplayMenu;

/**
 * @author Brijesh Mavani
 *
 */
import data.DataGasPump1;
import data.DataStore;
public class DisplayMenu1 extends DisplayMenu{

	/**
	 * 
	 */
	public DisplayMenu1(DataStore dataStore) {
		// TODO Auto-generated constructor stub
		super(dataStore);
	}
	
	@Override
	public void displayMenu() {
		DataGasPump1 d1 = (DataGasPump1) dataStore;		
        System.out.println("Card is approved!!!");
        System.out.println("Gas types: Regular and Diesel");
        System.out.println("Please select from available gas types: ");
        System.out.println("(7) Regular at [$" + d1.getRprice1() + "/gal] " +
                        "\n(8) Diesel at  [$" + d1.getDprice1() + "/gal]");

        System.out.println("If you want to cancel the transaction, select (9)");
	}

}
