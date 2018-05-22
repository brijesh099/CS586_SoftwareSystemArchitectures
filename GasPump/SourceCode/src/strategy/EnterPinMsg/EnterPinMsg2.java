package strategy.EnterPinMsg;

/*
* @author Brijesh Mavani
*
*/

/*
	GP-2 do not support debit card payment method. No action will be taken.
*/
public class EnterPinMsg2 extends EnterPinMsg {
	
	
    /*
        GP-2 do not support debit card payment method.
     */
    @Override
    public void enterPinMsg() {        
    }
}
