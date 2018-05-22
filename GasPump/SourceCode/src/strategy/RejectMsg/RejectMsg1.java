package strategy.RejectMsg;

/**
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible for printing rejection message for a credit card in GP-1. 
*/
public class RejectMsg1 extends RejectMsg {

    /*
        Print a message to user stating his/her credit card has been rejected.
    */
    @Override
    public void rejectMsg() {
        System.out.println("Your credit card has been rejected.....");
        System.out.println("Your transaction is cancelled.....");
    }
}
