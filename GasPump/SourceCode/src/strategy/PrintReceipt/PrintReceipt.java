package strategy.PrintReceipt;

import data.DataStore;

/**
 * @author Brijesh Mavani
 *
 */

/*
    This is an abstract class for PrintReceipt action
 */

public abstract class PrintReceipt {
    DataStore dataStore;

    public PrintReceipt(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void printReceipt();
}
