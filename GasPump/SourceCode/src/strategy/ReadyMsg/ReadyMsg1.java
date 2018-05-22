package strategy.ReadyMsg;

import data.DataGasPump1;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible for printing a ready message for GP-1.
*/
public class ReadyMsg1 extends ReadyMsg {

    public ReadyMsg1(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Print message to user indicating GasPump is ready now to pump the gas. 
     */
    @Override
    public void readyMsg() {
    	DataGasPump1 d1 = (DataGasPump1) dataStore;
        System.out.println("GasPump 1 is now ready to pump the gasoline!!!");
        System.out.println("Seleted gas type: "+d1.getGasType1());
        System.out.println("To pump one gallon, select (p)");
        System.out.println("If you want to stop, press (x)");
    }
}
