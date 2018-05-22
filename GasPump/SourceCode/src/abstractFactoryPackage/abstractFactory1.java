package abstractFactoryPackage;

/**
 * @author Brijesh Mavani
 *
 */

import data.DataGasPump1;
import data.DataStore;
import strategy.CancelMsg.CancelMsg;
import strategy.CancelMsg.CancelMsg1;
import strategy.DisplayMenu.DisplayMenu;
import strategy.DisplayMenu.DisplayMenu1;
import strategy.EnterPinMsg.EnterPinMsg;
import strategy.EnterPinMsg.EnterPinMsg1;
import strategy.GasPumpedMsg.GasPumpedMsg;
import strategy.GasPumpedMsg.GasPumpedMsg1;
import strategy.InitializeData.InitializeData;
import strategy.InitializeData.InitializeData1;
import strategy.PayMsg.PayMsg;
import strategy.PayMsg.PayMsg1;
import strategy.PrintReceipt.PrintReceipt;
import strategy.PrintReceipt.PrintReceipt1;
import strategy.PumpGasUnit.PumpGasUnit;
import strategy.PumpGasUnit.PumpGasUnit1;
import strategy.ReadyMsg.ReadyMsg;
import strategy.ReadyMsg.ReadyMsg1;
import strategy.RejectMsg.RejectMsg;
import strategy.RejectMsg.RejectMsg1;
import strategy.ReturnCash.ReturnCash;
import strategy.ReturnCash.ReturnCash1;
import strategy.SetInitialValues.SetInitialValues;
import strategy.SetInitialValues.SetInitialValues1;
import strategy.SetPrice.SetPrice;
import strategy.SetPrice.SetPrice1;
import strategy.StopMsg.StopMsg;
import strategy.StopMsg.StopMsg1;
import strategy.StoreCash.StoreCash;
import strategy.StoreCash.StoreCash1;
import strategy.StorePin.StorePin;
import strategy.StorePin.StorePin1;
import strategy.StorePrices.StorePrices;
import strategy.StorePrices.StorePrices1;
import strategy.WrongPinMsg.WrongPinMsg;
import strategy.WrongPinMsg.WrongPinMsg1;


/*
It provides the required driver objects for Gas Pump 1
Instantiates the proper action strategies with the shared data structure
When output needs to be printed/displayed, object of an output processor will be instantiated  
The methods provided by this class will be called by output processor to bind actions specific to  Gas Pump 1. 
*/

public class abstractFactory1 extends AbstractFactory {
	private DataStore dataStore;

	/**
	 * 
	 */
	public abstractFactory1() {
		// TODO Auto-generated constructor stub
		// The DS is created and will be passed to all the classes which needs it
		this.dataStore  = new DataGasPump1();
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
    public StorePrices getStorePrices(){
    	return new StorePrices1(this.dataStore);

    }
    /*
		Returns the PayMsg class that displays the pay message for GP-1 
    */

    @Override
    public PayMsg getPayMsg(){
    	return new PayMsg1();

    }
    /*
		Returns the InitializeData class that initializes the price to 0 for GP-1 
     */

    @Override
    public InitializeData getInitializeData(){
    	return new InitializeData1(this.dataStore);

    }
    /*
		Returns the StoreCash class that Stores the cash in DS for GP-1.
		GP-1 do not have cash payment method. So, this won't be called. 
     */
    
    
    @Override
    public StoreCash getStoreCash(){
    	return new StoreCash1();  // GP1 do not have cash as a payment method
    }

    /*
		Returns the DisplayMenu class that displays available operation for GP-1.
     */
    
        
    @Override
    public DisplayMenu getDisplayMenu(){
    	return new DisplayMenu1(this.dataStore);
    }
    /*
		Returns the EnterPinMsg class that displays message for entering pin for debit card in GP-1.
     */        
    
    @Override
    public EnterPinMsg getEnterPinMsg(){
    	return new EnterPinMsg1();
    }
    /*
		Returns the StorePin class that stores the debit card pin into DS.
     */
    
    
    @Override
    public StorePin getStorePin(){
    	return new StorePin1(this.dataStore);
    }
    /*
		Returns the SetPrice class that set the price for selected gas type in GP-1.
     */
        
    
    @Override
    public SetPrice getSetPrice(){
    	return new SetPrice1(this.dataStore);
    }
    
    /*
		Returns the SetInitialValues class that initializes the total and G to 0 
     */
    
    
    @Override
    public SetInitialValues getSetInitialValues(){
    	return new SetInitialValues1(this.dataStore);
    }
    /*
		Returns the ReadyMsg class that displays the pump ready message  
     */
    
    
    @Override
    public ReadyMsg getReadyMsg(){
    	return new ReadyMsg1(this.dataStore);

    }
    /*
		Returns the PumpGasUnit class that pumps the one gallon of gas selected by user 
     */
    
    
    
    @Override
    public PumpGasUnit getPumpGasUnit(){
    	return new PumpGasUnit1(this.dataStore);
    }
    /*
		Returns the GasPumpedMsg class that displays message to user that the gallon of gas is pumped  
     */
    
    
    @Override
    public GasPumpedMsg getGasPumpedMsg(){
    	return new GasPumpedMsg1(this.dataStore);

    }
    
    /*
		Returns the StopMsg class that displays message to user stating gas pump is stopped  
     */    
    @Override
    public StopMsg getStopMsg(){
    	return new StopMsg1();
    }
    /*
		Returns the PrintReceipt class that prints the receipt with amount of pumped gas and cost to user   
     */        
    @Override
    public PrintReceipt getPrintReceipt(){
    	return new PrintReceipt1(this.dataStore);
    }
    /*
		Returns the ReturnCash class that returns the remaining cash to user
		GP 1 do not support cash payments. So, this won't be called.  
     */        
    @Override
    public ReturnCash getReturnCash(){
    	return new ReturnCash1();  // GP 1 do not support cash payments. Hence, no possible way for returning cash
    	
    }
    /*
		Returns the WrongPinMsg class that displays message to user notifying entered pin is incorrect.   
     */           
    @Override
    public WrongPinMsg getWrongPinMsg(){
    	return new WrongPinMsg1();

    }
    /*
		Returns the RejectMsg class that displays message to user notifying credit card has been rejected  
     */           
    @Override
    public RejectMsg getRejectMsg(){
    	return new RejectMsg1();
    }
    /*
		Returns the Cancel class that displays message to user notifying current transaction is cancelled  
     */               
    @Override
    public CancelMsg getCancelMsg(){
    	return new CancelMsg1();
    }
    

}
