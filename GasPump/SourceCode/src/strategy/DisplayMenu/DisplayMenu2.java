/**
 * 
 */
package strategy.DisplayMenu;

/**
 * @author Brijesh Mavani
 *
 */
import data.DataGasPump2;
import data.DataStore;
public class DisplayMenu2  extends DisplayMenu{

	/**
	 * 
	 */
	public DisplayMenu2(DataStore dataStore) {
		// TODO Auto-generated constructor stub
		super(dataStore);
	}
	
	@Override
	public void displayMenu() {
		DataGasPump2 d2 = (DataGasPump2) dataStore;
        System.out.println("Gas types: Regular, Super and Premium");
        System.out.println("Please select from available gas types: ");
        System.out.println("(6) Premium at  [$" + d2.getPprice2() + "/L] " +
        				   "\n(7) Regular at [$" + d2.getRprice2() + "/L] " +
                        "\n(8) Super at  [$" + d2.getSprice2() + "/L]");

        System.out.println("If you want to cancel the transaction, select (5)");
	}

}
