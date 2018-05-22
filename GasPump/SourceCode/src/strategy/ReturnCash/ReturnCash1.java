package strategy.ReturnCash;
/**
 * @author Brijesh Mavani
 *
 */

/*
As GP-1 do not support cash transactions, this class will not perform any action(s). 
*/

public class ReturnCash1 extends ReturnCash {

    /*
      In case method gets invoked, do not perform any action. 
    */
    @Override
    public void returnCash() {

    }
}
