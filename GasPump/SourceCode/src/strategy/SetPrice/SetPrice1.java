package strategy.SetPrice;

import data.DataGasPump1;
import data.DataStore;

/*
    This class is responsible for updating price based on gas type selected by user for GP-1.
 */
public class SetPrice1 extends SetPrice {

    public SetPrice1(DataStore dataStore) {
        super(dataStore);
    }

    /*
        Set the price per gallon for this transaction according to the type of gas which was selected to be pumped

        @param g : integer passed in from the EFSM model representing the type of gasoline
        for which the price calculation must be set
        For GasPump1:
        g = 1: Regular gas
        g = 4: Diesel gas
     */
    @Override
    public void setPrice(int g, int m) {
        DataGasPump1 d1 = (DataGasPump1) dataStore;
        if (g == 1) { // Regular selected
            d1.setPrice1(d1.getRprice1());
            d1.setGasType1("Regular");
        } else if (g == 4) { // Diesel selected
            d1.setPrice1(d1.getDprice1());
            d1.setGasType1("Diesel");
        }
        System.out.println(d1.getGasType1() + " gasoline selected @ price of $" + d1.getPrice1() + "/gallon");
        System.out.println("Select (s) to start the pump");
    }
}
