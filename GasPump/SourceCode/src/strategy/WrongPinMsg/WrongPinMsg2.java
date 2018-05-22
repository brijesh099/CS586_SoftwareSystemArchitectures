package strategy.WrongPinMsg;

/*
* @author Brijesh Mavani
*
*/

/*
	GP-2 do not support debit card payment method. No action will be taken.
*/
public class WrongPinMsg2 extends WrongPinMsg {
	
	
    /*
        GP-2 do not support debit card payment method.
     */
    @Override
    public void wrongPinMsg() {        
    }
}
 