package strategy.InitializeData;

import data.DataGasPump1;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible to set initial values to GP-1 DS.
*/


public class InitializeData1 extends InitializeData {

    public InitializeData1(DataStore dataStore) {
        super(dataStore);
    }

    /*
       Price will be set to 0 initially. 
     */
    @Override
    public void initializeData() {
        DataGasPump1 d1 = (DataGasPump1) dataStore;
        d1.setPrice1(0);        
    }
}
