package strategy.ReadyMsg;

import data.DataGasPump2;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */

/*
This class is responsible for printing a ready message for GP-2.
*/
public class ReadyMsg2 extends ReadyMsg {

    public ReadyMsg2(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Print message to user indicating GasPump is ready now to pump the gas. 
     */
    @Override
    public void readyMsg() {
    	DataGasPump2 d2 = (DataGasPump2) dataStore;
        System.out.println("GasPump 2 is now ready to pump the gasoline!!!");
        System.out.println("Seleted gas type: "+d2.getGasType2());
        System.out.println("To pump one liter, select (p)");
        System.out.println("If you want to stop, press (x)");
    }
}
