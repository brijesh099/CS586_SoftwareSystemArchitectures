package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S1 State
 */
class S1 extends State {

    S1(MDAEFSM mda) {
        super(mda);
    }

    /*
     * t==1: credit card payment.
     * 		 M will be set to 1 to increase a price
     * 		 change state to S2
     * t==2: cash payment.
     * 		 perform actions StoreCash() and DisplayMenu() and setting M.
     * 		 change state to S3
     * t==3: debit card payment.
     * 		 perform actions EnterPinMsg() and StorePin()
     * 		 change state to S8 
     */
    
    @Override
    void payType(int t) {
    	if(mda.s==mda.LS[1]) {
    		if(t==1) {
    			mda.setM(1);
    			mda.s=mda.LS[2];
    		}
    		else if(t==2) {
    			mda.getOP().StoreCash();
                mda.getOP().DisplayMenu();
                mda.setM(0);
                mda.s=mda.LS[3];
    		}
    		else if(t==3) {
    			mda.getOP().EnterPinMsg();
                mda.getOP().StorePin();
                mda.s=mda.LS[8];
    		}
    	}
    }
}
