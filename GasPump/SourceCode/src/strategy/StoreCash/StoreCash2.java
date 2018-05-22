package strategy.StoreCash;

import data.DataGasPump2;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
    GasPump2 StoreCash action responsible for updating the shared data structure with the inserted cash amount
    during each transaction
 */
public class StoreCash2 extends StoreCash {

    public StoreCash2(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Read the temporarily cash information input by the InputProcessor
        and store it in the cash attribute of the shared data structure.
        Then, print the amount of cash that was inserted
     */
    @Override
    public void storeCash() {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        d2.setCash(d2.getTemp_cash());
        System.out.println("Amount of cash inserted: $" + d2.getCash());
    }
}
