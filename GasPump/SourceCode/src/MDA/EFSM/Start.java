package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    Staring state of the EFSM model
 */
class Start extends State {

    Start(MDAEFSM mda) {
        super(mda);
    }

    /*
        Store the input prices into temp variables and change state to S0
     */
    @Override
    void activate() {
        if (mda.s == mda.LS[9]) {
        	mda.getOP().StorePrices();
        	mda.s = mda.LS[0];
            
        }
    }
}
