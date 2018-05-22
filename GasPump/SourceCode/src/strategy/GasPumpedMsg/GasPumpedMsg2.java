package strategy.GasPumpedMsg;

import data.DataGasPump2;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */
public class GasPumpedMsg2 extends GasPumpedMsg {

    public GasPumpedMsg2(DataStore dataStore) {
        super(dataStore);
    }

    /*
           It will print msg to inform user that one liter of gasoline is pumped. It will also print msg to user indicating total number of pumped liters.
     */
    @Override
    public void gasPumpedMsg() {
        DataGasPump2 d2 = (DataGasPump2) dataStore;
        System.out.println("Pumped 1 liter of " + d2.getGasType2() + " gasoline");     
        System.out.println("Total "+ d2.getL2()+" liter(s) pumped.");
    }
}
 