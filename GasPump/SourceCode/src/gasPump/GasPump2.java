package gasPump;


/**
 * @author Brijesh Mavani
 *
 */

import abstractFactoryPackage.AbstractFactory;
import data.DataGasPump2;

/*
    This class is the InputProcessor for GasPump2
 */
public class GasPump2 extends GasPump {
    public GasPump2(AbstractFactory af) {
        super(af);
    }

    /*
        Print a menu of supported operations
     */
    @Override
    public void printOperations() {
        System.out.println(
        				"#########################################################################"+
                        "\nSelect operation: " +
                        "\n(0) Activate(float a, float b, float c)" +
                        "  (1) PayCash(int c) " +
                        "  (2) PayCredit " +
                        "  (3) Approved " +
                        "\n(4) Reject " +                    
                        "  (5) Cancel " +
                        "  (6) Premium " +
                        "  (7) Regular " +	
                        "\n(8) Super " +
                        "  (s) StartPump " +
                        "  (p) PumpLiter " +
                        "  (x) Stop" +                        
                        "\n(r) Receipt " +
                        "  (n) NoReceipt " +
                        "  (q) Quit the program " +
                        "\n#########################################################################"
        );
    }

    /*
      Validate input and call the activate() event of EFSM. 
		In case of invalid input print message to user notifying same. 
        
        @param a: Super gas price
        @param b: Regular gas price
        @param c: Premium gas price
    */
    public void Activate(float a, float b, float c) {
        if (a > 0 && b > 0 && c > 0) {
            DataGasPump2 d2 = (DataGasPump2) dataStore;
            d2.setTemp_a2(a);
            d2.setTemp_b2(b);
            d2.setTemp_c2(c);
            mda.activate();
        } else {
        	System.out.println("All the prices should be positive. Please recheck and enter again.");
            System.out.println("Activation is failed for above reason!!!");
        }
    }

    /*
    Call the start() event of EFSM model
 */
    public void Start() {
        mda.start();
    }

    /*
    Validate the input and call the payType event of EFSM model by passing "2" as input indicating payment will be made by Cash. 
    
    */    
    
    public void PayCash(float c) {
        if (c <= 0) {
        	System.out.println("Please enter the cash amount which is greater than 0");
        } 
        else {
        	DataGasPump2 d2 = (DataGasPump2) dataStore;
            d2.setTemp_cash(c);
            mda.start();
            mda.payType(2);            
        }
    }
    
    /*
    Validate the input and call the payType event of EFSM model by passing "3" as input indicating payment will be made by Credit Card.     
    */    
    
    public void PayCredit() {
        mda.start();
    	mda.payType(1);                    
    }

    /*
    Call the approve() event of EFSM
 */
public void Approve() {
    mda.approve();
}

/*
    Call the reject()  event of EFSM
 */
public void Reject() {
    mda.reject();
}

/*
    Call the cancel()  event of EFSM
 */
public void Cancel() {
    mda.cancel();
}

/*
	Call the selectGas() event of EFSM by passing 1 as gas type to indicate Regular
	
*/
    public void Regular() {
        mda.selectGas(1);
        mda.Continue();
    }

    /*
	Call the selectGas() event of EFSM by passing 2 as gas type to indicate Super
	
     */
    public void Super() {
        mda.selectGas(2);
        mda.Continue();
    }

    /*
	Call the selectGas() event of EFSM by passing 3 as gas type to indicate Premium
	
     */
    public void Premium() {
        mda.selectGas(3);
        mda.Continue();
    }

    /*
        Call the startPump() event of EFSM
     */
    public void StartPump() {
        mda.startPump();
    }

    /*
       First check whether payment type is card or cash. If its card pump gas. 
       If its cash then check whether there is a sufficient cash. If yes, pump gas. 
       Else, print message indicating user that no cash available for another liter of gas and invoke stopPump action event of EFmda.
    */
    public void PumpLiter() {
    	if(mda.getM()==0){ 
	        DataGasPump2 d2 = (DataGasPump2) dataStore;
	        if (d2.getCash() >= (d2.getPrice2() * (d2.getL2() + 1))) {
	        	mda.pump();
	        } else {
	        	System.out.println("You do not have sufficient cash");
	            mda.stopPump();
	        }
    	}
    	else {
    		mda.pump();
    	}
    }

    /*
        Call the stopPump() event of EFSM
     */
    public void Stop() {
        mda.stopPump();
    }

    /*
        Call the receipt() event of EFSM
     */
    public void Receipt() {
        mda.receipt();
    }

    /*
        Call the noReceipt() event of EFSM
     */
    public void NoReceipt() {
        mda.noReceipt();
    }
}
