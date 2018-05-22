package strategy.InitializeData;

import data.DataGasPump2;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible to initialize cash and price to 0 in GP-2 DS.
*/


public class InitializeData2 extends InitializeData {

    public InitializeData2(DataStore dataStore) {
        super(dataStore);
    }

    /*
       cash and price will be set to 0 initially. 
     */
    @Override
    public void initializeData() {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        d2.setCash(0);
        d2.setPrice2(0);
    }
}
