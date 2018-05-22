package MDA.EFSM;
/**
 * @author Brijesh Mavani
 *
 */

/*
    S5 State
 */
class S5 extends State {
	/*
		This state has two possible operations Pump and StopPump.
	 */

	

    S5(MDAEFSM mda) {
        super(mda);
    }

    /*
        Perform actions PumpGasUnit and GasPumpedMsg. No change of state.
     */
    @Override
    void pump() {
        if (mda.s == mda.LS[5]) {
            mda.getOP().PumpGasUnit();
            mda.getOP().GasPumpedMsg();
        }
    }

    /*
       Perform action StopMsg and change state to S6
     */
    @Override
    void stopPump() {
        if (mda.s == mda.LS[5]) {
            mda.getOP().StopMsg();
            mda.s = mda.LS[6];            
        }
    }
}
