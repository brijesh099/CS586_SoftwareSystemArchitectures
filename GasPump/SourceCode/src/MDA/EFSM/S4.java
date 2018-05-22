package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S4 State
 */
class S4 extends State {

    S4(MDAEFSM mda) {
        super(mda);
    }

    /*
        Perform actions SetInitialValues and ReadyMsg then change state to S5
     */
    @Override
    void startPump() {
        if (mda.s == mda.LS[4]) {            
            mda.getOP().SetInitialValues();
            mda.getOP().ReadyMsg();
            mda.s = mda.LS[5];
        }
    }
}
