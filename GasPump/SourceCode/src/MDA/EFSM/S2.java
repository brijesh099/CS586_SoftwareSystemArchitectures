package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S2 State
 */
class S2 extends State {
	/*
    	This state has two possible operations Approve and Reject.
	*/
	
    S2(MDAEFSM mda) {
        super(mda);
    }

    /*
        Call DisplayMenu() action and change state to S3
     */
    @Override
    void approve() {
        if (mda.s == mda.LS[2]) {            
            mda.getOP().DisplayMenu();
            mda.s = mda.LS[3];
        }
    }

    /*
        Call RejectMsg() action and change state to S0
     */
    @Override
    void reject() {
        if (mda.s == mda.LS[2]) {
            mda.getOP().RejectMsg();
            mda.s = mda.LS[0];
        }
    }
}
