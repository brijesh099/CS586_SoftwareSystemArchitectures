package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S8 State
 */
class S8 extends State {

    S8(MDAEFSM mda) {
        super(mda);
    }

    /*
        Perform action WrongPinMsg and change state to S0
     */
    @Override
    void incorrectPin() {
        if (mda.s == mda.LS[8]) {
            mda.getOP().WrongPinMsg();
            mda.s = mda.LS[0];
        }
    }


    /*
        Perform action DisplayMenu and change state to S3
     */
    @Override
    void correctPin() {
        if (mda.s == mda.LS[8]) {
            mda.getOP().DisplayMenu();
            mda.s = mda.LS[3];
        }
    }

}
