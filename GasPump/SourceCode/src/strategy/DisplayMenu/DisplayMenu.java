/**
 * 
 */
package strategy.DisplayMenu;
 
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for DisplayMenu action
*/
public abstract class DisplayMenu {
	DataStore dataStore;
	/**
	 * 
	 */
	public DisplayMenu(DataStore dataStore) {
		// TODO Auto-generated constructor stub
		this.dataStore=dataStore;
	}
	
	public abstract void displayMenu();

}
