package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S3 State
 */
class S3 extends State {
	/*
		This state has three possible operations Cancel, Continue and selectGas.
	 */


    S3(MDAEFSM mda) {
        super(mda);
    }

    /*
        Call setPrice operation and keep same state
     */
    @Override
    void selectGas(int g) {
        if (mda.s == mda.LS[3]) {
        	int m = mda.getM();
            mda.getOP().SetPrice(g,m);
        }
    }

    /*
        Perform actions CancelMsg and ReturnCash. Then change state to S0
     */
    @Override
    void cancel() {
        if (mda.s == mda.LS[3]) {
            mda.getOP().CancelMsg();
            mda.getOP().ReturnCash();
            mda.s = mda.LS[0];
        }
    }
    
    /*
    	No actions will be performed only state changes to S4.
    */
    
    @Override
    void Continue() {
        if (mda.s == mda.LS[3]) {
            mda.s = mda.LS[4];

        }
    }
}
