package gasPump;

/**
 * @author Brijesh Mavani
 *
 */

import MDA.EFSM.MDAEFSM;
import MDA.OutputProcessor.OutputProcessor;
import abstractFactoryPackage.AbstractFactory;
import data.DataStore;

/*
	With Abstract factory design pattern, this class is an abstract superclass which is an implementation of a client side. 
	It provides the constructor. The constructor will be used by child classes to build their own driver and required objects. 
	AbstractFactory class will be responsible for making sure that each returned object has a valid reference. 
*/

public abstract class GasPump {
    DataStore dataStore;
    MDAEFSM mda;


    GasPump(AbstractFactory af) {
        this.dataStore = af.getDataStore();
        this.mda = new MDAEFSM();
        this.mda.setOP(new OutputProcessor(af));
    }

    /*
        To display supported actions of each GasPump.
     */
    public abstract void printOperations();

}
