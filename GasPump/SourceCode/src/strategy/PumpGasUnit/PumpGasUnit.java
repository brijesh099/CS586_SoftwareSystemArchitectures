package strategy.PumpGasUnit;

import data.DataStore;

/**
 * @author Brijesh Mavani
 *
 */

/*
This is an abstract class for PumpGasUnit action
*/
public abstract class PumpGasUnit {
    DataStore dataStore;

    public PumpGasUnit(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void pumpGasUnit();
}
