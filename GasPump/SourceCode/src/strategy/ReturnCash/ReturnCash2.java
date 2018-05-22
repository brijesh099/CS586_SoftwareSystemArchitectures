package strategy.ReturnCash;
import data.DataGasPump2;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
 GP-2 will return cash if there is any outstanding cash remaining.
*/

public class ReturnCash2 extends ReturnCash {

    public ReturnCash2(DataStore dataStore) {
        super(dataStore);
    }

    /*
     * Calculate the amount of cash to return. In case of amount turns out to > 0, print message to user and reset the variable to 0.
     */
    
    @Override
    public void returnCash() {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        float returnCash = (float)d2.getCash() - (float)d2.getTotal2();
        if ((returnCash) <= 0) {
        	System.out.println("No cash to be returned to user.");
        }
        else
        {
            System.out.println("Cash to be returned : $" + returnCash);
            System.out.println("Returning $" + returnCash);
        } 
        d2.setCash(0);
        System.out.println("Your transaction is finished!!!");
    }
}
