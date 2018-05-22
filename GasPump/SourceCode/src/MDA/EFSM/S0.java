package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S0 State
 */
class S0 extends State {

    S0(MDAEFSM mda) {
        super(mda);
    }

    /*
        perform actions Display PayMsg, initialize Data and M then change state to S1.
     */
    @Override
    void start() {
        if (mda.s == mda.LS[0]) {
        	mda.getOP().PayMsg();
        	mda.getOP().InitializeData();
        	mda.getOP().SetInitialValues();
        	mda.setM(1);        	
        	mda.s = mda.LS[1];
            
        }
    }
}
