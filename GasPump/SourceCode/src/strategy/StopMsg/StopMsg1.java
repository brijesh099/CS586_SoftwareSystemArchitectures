package strategy.StopMsg;

/**
 * @author Brijesh Mavani
 *
 */

/*
    This class is responsible for letting user know that pump is stopping for GP-1 by printing message.
 */
public class StopMsg1 extends StopMsg {

    /*
        print stoping message
     */
    @Override
    public void stopMsg() {
        System.out.println("Stopping GasPump - 1...");
    }
}
