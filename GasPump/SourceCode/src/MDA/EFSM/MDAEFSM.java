package MDA.EFSM;

/**
 * @author Brijesh Mavani
 *
 */

import MDA.OutputProcessor.OutputProcessor;

/*
    System is designed using the de-centralized state design pattern.
    All state classes are responsible for changing states as well as performing actions.
 */

public class MDAEFSM {
    protected State s;
    protected State[] LS;
    private OutputProcessor op;
    private int M=0;

    public MDAEFSM() {
        // list of states in the EFSM
        LS = new State[10];

        // instantiate each state, passing in a reference to this VM class
        LS[9] = new Start(this);
        LS[0] = new S0(this);
        LS[1] = new S1(this);
        LS[2] = new S2(this);
        LS[3] = new S3(this);
        LS[4] = new S4(this);
        LS[5] = new S5(this);
        LS[6] = new S6(this);
        LS[8] = new S8(this);

        s = LS[9]; // It is in Start state initially
    }
    /*
        Getters and Setters
     */

    public OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    /*
        State operations --> forward the called operation to the state class
     */

    public void activate() {
        s.activate();
    }

    public void start() {
        s.start();
    }

    /*
        @param t : t = 1 credit card payment type
                   t = 2 cash payment type
                   t = 3 debit card payment type
     */
    public void payType(int t) {
    	s.payType(t);
    }

    public void approve() {
        s.approve();
    }

    public void reject() {
        s.reject();
    }

    public void cancel() {
        s.cancel();
    }

    /*
        @param g: g = 1 Regular gas
                  g = 2 Super gas
                  g = 3 Premium gas
                  g = 4 Diesel gas
     */
    
    public void selectGas(int g) {
        s.selectGas(g);
    }

    public void startPump() {
        s.startPump();
    }

    public void pump() {
        s.pump();
    }

    public void stopPump() {
        s.stopPump();
    }

    public void receipt() {
        s.receipt();
    }

    public void noReceipt() {
        s.noReceipt();
    }
    
    public void correctPin() {
    	s.correctPin();
    }
    
    public void incorrectPin() {
    	s.incorrectPin();
    }
    
    public void Continue() {
    	s.Continue();
    }
    
	/**
	 * @return the m
	 */
	public int getM() {
		return M;
	}

	/**
	 * @param m the m to set
	 */
	public void setM(int m) {
		this.M = m;
	}


}
