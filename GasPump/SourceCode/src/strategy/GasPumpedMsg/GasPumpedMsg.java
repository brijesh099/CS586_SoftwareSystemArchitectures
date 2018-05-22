package strategy.GasPumpedMsg;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */
/*
This is an abstract class for GasPumpedMsg action
*/
public abstract class GasPumpedMsg {
    DataStore dataStore;
    public GasPumpedMsg(DataStore dataStore) {
        this.dataStore= dataStore;
    }

    public abstract void gasPumpedMsg();
}
