package strategy.GasPumpedMsg;

import data.DataGasPump1;
import data.DataStore;
/**
 * @author Brijesh Mavani
 *
 */
public class GasPumpedMsg1 extends GasPumpedMsg {

    public GasPumpedMsg1(DataStore dataStore) {
        super(dataStore);
    }
    

    /*
       It will print msg to inform user that one gallon of gasoline is pumped. It will also print msg to user indicating total number of pumped gallons.
     */

    @Override
    public void gasPumpedMsg() {
        DataGasPump1 d1 = (DataGasPump1) dataStore;
        System.out.println("Pumped 1 gallon of " + d1.getGasType1() + " gasoline");
        System.out.println("Total "+ d1.getG1()+" gallons pumped.");
    }

}
