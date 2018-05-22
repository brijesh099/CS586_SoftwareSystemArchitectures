package strategy.SetInitialValues;

import data.DataGasPump1;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible to set initial values to GP-1 DS.
*/


public class SetInitialValues1 extends SetInitialValues {

    public SetInitialValues1(DataStore dataStore) {
        super(dataStore);
    }

    /*
       G and total will be set to 0 initially. 
     */
    @Override
    public void setInitialValues() {
        DataGasPump1 d1 = (DataGasPump1) dataStore;
        d1.setG1(0);
        d1.setTotal1(0);
    }
}
