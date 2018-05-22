package gasPump;


/**
 * @author Brijesh Mavani
 *
 */

import abstractFactoryPackage.AbstractFactory;
import data.DataGasPump1;

/*
    This class is the InputProcessor for GasPump1
 */
public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }

    /*
        printing operation of GP-1
     */ 
    @Override
    public void printOperations() {
        System.out.println(
                        "#########################################################################"+
                        "\nSelect operation: " +
                        "\n(0) Activate(float a, float b) " +
                        "\n(1) Start " +
                        "(2) PayCredit " +
                        "(3) PayDebit(String p)"+
                        "(4) Pin (String p)"+                          
                        "(5) Approved " +
                        "(6) Reject" +
                        "\n(7) Regular " +
                        "(8) Diesel " +
                        "(9) Cancel " +
                        "\n(s) StartPump " +
                        "(p) PumpGallon " +
                        "(x) StopPump " +
                        "(f) FullTank" +
                        "(q) Quit the program " +
                        "\n#########################################################################"
        );
    }

    /*
        Validate input and call the activate() event of EFmda. 
		In case of invalid input print message to user notifying same. 
        
        @param a: Regular gas price
        @param b: Diesel gas price
     */
    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            DataGasPump1 d1 = (DataGasPump1) this.dataStore;
            d1.setTemp_a1(a);
            d1.setTemp_b1(b);
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
        call the payType event of EFSM model by passing "1" as input indicating payment will be made by credit card. 
        No Authentication will happen for this hence simply print authentication message
     */
    public void PayCredit() {
    	//System.out.println("Authenticating your card...Please wait for a while!!!");
    	mda.payType(1);        
    }

    /*
    Validate the input pin and save the debit card pin in temp variable and call the payType event of EFSM model by passing "3" as input indicating payment will be made by debit card. 
    Simply print debit card selection message
    @param p: Debit card pin
 */
    public void PayDebit(String p) {
    	if(p.length()>0)
    	{
    		DataGasPump1 d1 = (DataGasPump1) this.dataStore;
    		//System.out.println("Debit card selected!!!");
    		d1.setTemp_p1(p);
    		//System.out.println("Debit card pin is set to : "+d1.getTemp_p1());
    		mda.payType(3);
    	}
    	else
    	{
    		System.out.println("Pin should have length greater than 0");
    	}
    }
    /*
    Validate the input pin by checking its length. If less than 0 print error message. Else compare it will the stored temp pin.
    if both pins are matched, call correctPin() event of EFSM. Else call incorrectPin() event of EFSM
    @param p: Debit card pin
    */
    public void Pin(String p) {
    	if(p.length()>0) {
    		DataGasPump1 d1 = (DataGasPump1) this.dataStore;
    		//System.out.println("Checking pin");
    		if(p.compareTo(d1.getPin())==0){
    			//System.out.println("Both pins matched...");
    			mda.correctPin();
    		}
    		else {
    			//System.out.println("Both pins are different...");
    			mda.incorrectPin();
    		}    		
    	}
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
    }

    /*
        Call the selectGas() event of EFSM by passing 4 as gas type to indicate Diesel
        
     */
    public void Diesel() {
        mda.selectGas(4);
    }

    /*
        Call the startPump() event of EFSM 
     */
    public void StartPump() {
    	 DataGasPump1 d1 = (DataGasPump1) this.dataStore;
    	if(d1.getPrice1()>0) {
    		mda.Continue();
    		mda.startPump();
    	}
    }

    /*
        Call the pump() event of EFSM 
     */
    public void PumpGallon() {
        mda.pump();
    }

    /*
        call the stopPump() and receipt() events of EFSM 
        As per current design, GP-1 will always print receipt at end of the transaction.
     */
    
    public void StopPump() {
        mda.stopPump();
        mda.receipt();
    }
    
    /*
    call the stopPump() and receipt() events of EFSM 
    As per current design, GP-1 will always print receipt at end of the transaction.
     */

    public void FullTank() {
        mda.stopPump();
        mda.receipt();
    }
}
