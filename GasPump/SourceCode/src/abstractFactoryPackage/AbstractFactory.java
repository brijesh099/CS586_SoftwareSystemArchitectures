package abstractFactoryPackage;

/**
 * @author Brijesh Mavani
 *
 */

import data.DataStore;
import strategy.CancelMsg.CancelMsg;
import strategy.DisplayMenu.DisplayMenu;
import strategy.EnterPinMsg.EnterPinMsg;
import strategy.GasPumpedMsg.GasPumpedMsg;
import strategy.InitializeData.InitializeData;
import strategy.PayMsg.PayMsg;
import strategy.PrintReceipt.PrintReceipt;
import strategy.PumpGasUnit.PumpGasUnit;
import strategy.ReadyMsg.ReadyMsg;
import strategy.RejectMsg.RejectMsg;
import strategy.ReturnCash.ReturnCash;
import strategy.SetInitialValues.SetInitialValues;
import strategy.SetPrice.SetPrice;
import strategy.StopMsg.StopMsg;
import strategy.StoreCash.StoreCash;
import strategy.StorePin.StorePin;
import strategy.StorePrices.StorePrices;
import strategy.WrongPinMsg.WrongPinMsg;


/*
This is a super class for all abstract factory classes. It defines the methods which return 
action components to Gas Pump specific. All abstract factories need to implement these methods.

*/

public abstract class AbstractFactory {
	
	public abstract DataStore getDataStore();
	public abstract StorePrices getStorePrices();
	public abstract PayMsg getPayMsg();
	public abstract InitializeData getInitializeData();
	public abstract StoreCash getStoreCash();
	public abstract DisplayMenu getDisplayMenu();
	public abstract EnterPinMsg getEnterPinMsg();
	public abstract StorePin getStorePin();
	public abstract SetPrice getSetPrice();
	public abstract SetInitialValues getSetInitialValues();
	public abstract ReadyMsg getReadyMsg();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract GasPumpedMsg getGasPumpedMsg();
	public abstract StopMsg getStopMsg();
	public abstract PrintReceipt getPrintReceipt();
	public abstract ReturnCash getReturnCash();
	public abstract WrongPinMsg getWrongPinMsg();
	public abstract RejectMsg getRejectMsg();
	public abstract CancelMsg getCancelMsg();
}
