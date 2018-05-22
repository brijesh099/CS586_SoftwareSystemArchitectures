package strategy.WrongPinMsg;

/*
* @author Brijesh Mavani
*
*/

/*
This class is responsible for printing a wrong pin message for GP-1.
*/
public class WrongPinMsg1 extends WrongPinMsg {
	
	
    /*
        Print message to user telling pin is incorrect.
     */
    @Override
    public void wrongPinMsg() {
        System.out.println("Pin is incorrect. Transaction is cancelled. ");
    }
}
