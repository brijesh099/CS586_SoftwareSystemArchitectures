package strategy.PayMsg;

/**
 * @author Brijesh Mavani
 *
 */
/*
    This class is responsible for prompting for selecting payment method
 */
public class PayMsg1 extends PayMsg {

    @Override
    public void payMsg() {
        System.out.println("Please select payment type: Credit or Debit");
    }
}
