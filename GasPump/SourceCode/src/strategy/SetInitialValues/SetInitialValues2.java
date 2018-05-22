package strategy.SetInitialValues;

import data.DataGasPump2;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible to set initial values to GP-2 DS.
*/


public class SetInitialValues2 extends SetInitialValues {

    public SetInitialValues2(DataStore dataStore) {
        super(dataStore);
    }

    /*
       L and total will be set to 0 initially. 
     */
    @Override
    public void setInitialValues() {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        d2.setL2(0);
        d2.setTotal2(0);
    }
}
