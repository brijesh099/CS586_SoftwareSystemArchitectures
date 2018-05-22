/**
 * 
 */
package strategy.CancelMsg;

/**
 * @author Brijesh Mavani
 *
 */
public class CancelMsg1 extends CancelMsg {

	/**
	 * 
	 */
	@Override
	public void cancelMsg() {
		// TODO Auto-generated constructor stub
		// Print the msg  for cancel transactions
		System.out.println("Please wait (2 seconds) cancelling the transaction.");
		try {
			Thread.sleep(2000); // Sleep for 2 sec
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block			
		}
		System.out.println("Successfully cancelled the transaction.");
	}
	

}
