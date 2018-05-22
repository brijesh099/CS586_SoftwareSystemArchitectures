package MDA.OutputProcessor;

import abstractFactoryPackage.AbstractFactory;
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
    General output processor which will be initialized with proper action implementation for 
    specific Gas Pump. This has been implemented using Abstract factory design pattern.
    
    It is a client class for strategy design pattern. 
*/
public class OutputProcessor {
	private	StorePrices	storePrices;
	private	PayMsg	payMsg;
	private	InitializeData	initializeData;
	private	StoreCash	storeCash;
	private	DisplayMenu	displayMenu;
	private	EnterPinMsg	enterPinMsg;
	private	StorePin	storePin;
	private	SetPrice	setPrice;
	private	SetInitialValues	setInitialValues;
	private	ReadyMsg	readyMsg;
	private	PumpGasUnit	pumpGasUnit;
	private	GasPumpedMsg	gasPumpedMsg;
	private	StopMsg	stopMsg;
	private	PrintReceipt	printReceipt;
	private	ReturnCash	returnCash;
	private	WrongPinMsg	wrongPinMsg;
	private	RejectMsg	rejectMsg;
	private	CancelMsg	cancelMsg;
	


    public OutputProcessor(AbstractFactory af) {
    	this.storePrices  =  af.getStorePrices();
    	this.payMsg  =  af.getPayMsg();
    	this.initializeData  =  af.getInitializeData();
    	this.storeCash  =  af.getStoreCash();
    	this.displayMenu  =  af.getDisplayMenu();
    	this.enterPinMsg  =  af.getEnterPinMsg();
    	this.storePin  =  af.getStorePin();
    	this.setPrice  =  af.getSetPrice();
    	this.setInitialValues  =  af.getSetInitialValues();
    	this.readyMsg  =  af.getReadyMsg();
    	this.pumpGasUnit  =  af.getPumpGasUnit();
    	this.gasPumpedMsg  =  af.getGasPumpedMsg();
    	this.stopMsg  =  af.getStopMsg();
    	this.printReceipt  =  af.getPrintReceipt();
    	this.returnCash  =  af.getReturnCash();
    	this.wrongPinMsg  =  af.getWrongPinMsg();
    	this.rejectMsg  =  af.getRejectMsg();
    	this.cancelMsg  =  af.getCancelMsg();

    }

    /*
     *  following meta-actions are implemented using strategy pattern 
     */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g,int m) {
        this.setPrice.setPrice(g,m);
    }

    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void StorePrices() {
        this.storePrices.storePrices();
    }
    
    public void InitializeData() {
        this.initializeData.initializeData();
    }
    
    public void EnterPinMsg() {
        this.enterPinMsg.enterPinMsg();
    }
    
    public void StorePin() {
        this.storePin.storePin();
    }
    
    public void WrongPinMsg() {
        this.wrongPinMsg.wrongPinMsg();
    }
    
    

}
