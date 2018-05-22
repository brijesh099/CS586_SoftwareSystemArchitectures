package abstractFactoryPackage;

/**
 * @author Brijesh Mavani
 *
 */

import data.DataGasPump2;
import data.DataStore;
import strategy.CancelMsg.CancelMsg;
import strategy.CancelMsg.CancelMsg2;
import strategy.DisplayMenu.DisplayMenu;
import strategy.DisplayMenu.DisplayMenu2;
import strategy.EnterPinMsg.EnterPinMsg;
import strategy.EnterPinMsg.EnterPinMsg2;
import strategy.GasPumpedMsg.GasPumpedMsg;
import strategy.GasPumpedMsg.GasPumpedMsg2;
import strategy.InitializeData.InitializeData;
import strategy.InitializeData.InitializeData2;
import strategy.PayMsg.PayMsg;
import strategy.PayMsg.PayMsg2;
import strategy.PrintReceipt.PrintReceipt;
import strategy.PrintReceipt.PrintReceipt2;
import strategy.PumpGasUnit.PumpGasUnit;
import strategy.PumpGasUnit.PumpGasUnit2;
import strategy.ReadyMsg.ReadyMsg;
import strategy.ReadyMsg.ReadyMsg2;
import strategy.RejectMsg.RejectMsg;
import strategy.RejectMsg.RejectMsg2;
import strategy.ReturnCash.ReturnCash;
import strategy.ReturnCash.ReturnCash2;
import strategy.SetInitialValues.SetInitialValues;
import strategy.SetInitialValues.SetInitialValues2;
import strategy.SetPrice.SetPrice;
import strategy.SetPrice.SetPrice2;
import strategy.StopMsg.StopMsg;
import strategy.StopMsg.StopMsg2;
import strategy.StoreCash.StoreCash;
import strategy.StoreCash.StoreCash2;
import strategy.StorePin.StorePin;
import strategy.StorePin.StorePin2;
import strategy.StorePrices.StorePrices;
import strategy.StorePrices.StorePrices2;
import strategy.WrongPinMsg.WrongPinMsg;
import strategy.WrongPinMsg.WrongPinMsg2;


/*
It provides the required driver objects for Gas Pump 2
Instantiates the proper action strategies with the shared data structure
When output needs to be printed/displayed, object of an output processor will be instantiated  
The methods provided by this class will be called by output processor to bind actions specific to  Gas Pump 1. 
*/

public class abstractFactory2 extends AbstractFactory {
	private DataStore dataStore;

	public abstractFactory2() {
		// TODO Auto-generated constructor stub
		// The DS is created and will be passed to all the classes which needs it
		this.dataStore = new DataGasPump2();
	}

	// Return the DS created in constructor
	@Override
	public DataStore getDataStore() {
		return this.dataStore;
	}
	/*
		Returns the StoreData action strategy class. 
	*/

	@Override
	public StorePrices getStorePrices() {
		return new StorePrices2(this.dataStore);

	}
    /*
		Returns the PayMsg class that displays the pay message for GP-2 
    */

	@Override
	public PayMsg getPayMsg() {
		return new PayMsg2();

	}
    /*
		Returns the InitializeData class that initializes the price to 0 for GP-2 
     */

	@Override
	public InitializeData getInitializeData() {
		return new InitializeData2(this.dataStore);

	}
    /*
		Returns the StoreCash class that Stores the cash in DS for GP-2.
     */

	@Override
	public StoreCash getStoreCash() {
		return new StoreCash2(this.dataStore); 
	}
    /*
		Returns the DisplayMenu class that displays available operation for GP-2.
     */

	@Override
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu2(this.dataStore);
	}
    /*
		Returns the EnterPinMsg class that displays message for entering pin for debit card in GP-2.
		GP- 2 do not have debit card payment. So, this won't be called.
     */        

	@Override
	public EnterPinMsg getEnterPinMsg() {
		return new EnterPinMsg2();
	}
    /*
		Returns the StorePin class that stores the debit card pin into DS.
		GP- 2 do not have debit card payment. So, this won't be called.
     */        

	@Override
	public StorePin getStorePin() {
		return new StorePin2();
	}
    /*
		Returns the SetPrice class that set the price for selected gas type in GP-2.
     */

	@Override
	public SetPrice getSetPrice() {
		return new SetPrice2(this.dataStore);
	}
    /*
		Returns the SetInitialValues class that initializes the total and L to 0 
     */

	@Override
	public SetInitialValues getSetInitialValues() {
		return new SetInitialValues2(this.dataStore);
	}
    /*
		Returns the ReadyMsg class that displays the pump ready message  
     */

	@Override
	public ReadyMsg getReadyMsg() {
		return new ReadyMsg2(this.dataStore);

	}
    /*
		Returns the PumpGasUnit class that pumps the one gallon of gas selected by user 
     */

	@Override
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit2(this.dataStore);
	}
    /*
		Returns the GasPumpedMsg class that displays message to user that the gallon of gas is pumped  
     */

	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg2(this.dataStore);

	}
    
    /*
		Returns the StopMsg class that displays message to user stating gas pump is stopped  
     */    

	@Override
	public StopMsg getStopMsg() {
		return new StopMsg2();
	}
    /*
		Returns the PrintReceipt class that prints the receipt with amount of pumped gas and cost to user   
     */        

	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt2(this.dataStore);
	}
    /*
		Returns the ReturnCash class that returns the remaining cash to user		
     */        

	@Override
	public ReturnCash getReturnCash() {
		return new ReturnCash2(this.dataStore); // GP 2 do not support cash payments. Hence, no possible way for
												// returning cash

	}
    /*
		Returns the WrongPinMsg class that displays message to user notifying entered pin is incorrect.
		GP-2 do not have debit card payment method. So, this won't be called.   
     */           

	@Override
	public WrongPinMsg getWrongPinMsg() {
		return new WrongPinMsg2();

	}
    /*
		Returns the RejectMsg class that displays message to user notifying credit card has been rejected  
     */           

	@Override
	public RejectMsg getRejectMsg() {
		return new RejectMsg2();
	}
    /*
		Returns the Cancel class that displays message to user notifying current transaction is cancelled  
     */               

	@Override
	public CancelMsg getCancelMsg() {
		return new CancelMsg2();
	}

}
