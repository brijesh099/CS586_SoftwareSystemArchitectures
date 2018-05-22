package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S6 State
 */
class S6 extends State {
	/*
		This state has two possible operations Receipt and NoReceipt.
	 */
 
    S6(MDAEFSM mda) {
        super(mda);
    }

    /*
        Perform actions PrintReceipt and ReturnCash then change state to S0.
     */
    @Override
    void receipt() {
        if (mda.s == mda.LS[6]) {            
            mda.getOP().PrintReceipt();
            mda.getOP().ReturnCash();
            mda.s = mda.LS[0];
        }
    }

    /*
        Perform action ReturnCash then change state to S0.
     */
    @Override
    void noReceipt() {
        if (mda.s == mda.LS[6]) {            
            mda.getOP().ReturnCash();
            mda.s = mda.LS[0];
        }
    }
}
