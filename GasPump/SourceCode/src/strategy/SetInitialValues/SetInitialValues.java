package strategy.SetInitialValues;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for setting an initial values. 
*/
public abstract class SetInitialValues {
    DataStore dataStore;

    public SetInitialValues(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void setInitialValues();
}
