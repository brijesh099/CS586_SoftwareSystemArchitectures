package strategy.EnterPinMsg;

 /*
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible for printing a enter pin message for GP-1.
*/
public class EnterPinMsg1 extends EnterPinMsg {
	
	
    /*
        Print message to user asking for his/her debit card pin.
     */
    @Override
    public void enterPinMsg() {
        System.out.println("Please enter the debit card pin. ");
    }
}
