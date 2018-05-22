package strategy.ReadyMsg;

import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for ReadyMsg action
*/
public abstract class ReadyMsg {
    DataStore dataStore;

    public ReadyMsg(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void readyMsg();
}
