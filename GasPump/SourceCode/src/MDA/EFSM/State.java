package MDA.EFSM;

/**
 * @author Brijesh Mavani
 *
 */

/*
    This is an abstract state super class. Due to java requirement about abstract classes, each 
    class will print default message.
    Abstract methods should be override by each of the subclasses. But in our case each of the subclasses will
    have implementation for one or at max 2 methods while other methods will be empty. This will be waste of coding
    and memory. Hence, it was chosen that each method will print default message. 
    
    Each subclass will override these methods as per requirement. In case method is overridden then that implementation
    will be executed as default operation not allowed message will be printed. This will be the case if user is trying to 
    execute operation which is not supported by the current state of EFSM. */

public abstract class State {
	MDAEFSM mda;

	public State(MDAEFSM mda) {
		this.mda = mda;
	}

	void activate() {
		invalidOp();
	}

	void start() {
		invalidOp();
	}

	/*
	 * @param t : t = 1 credit card payment type t = 2 cash payment type t = 3 debit
	 * card payment type
	 */
	void payType(int t) {
		invalidOp();
	}

	void approve() {
		invalidOp();
	}

	void reject() {
		invalidOp();
	}

	/*
	 * @param g: g = 1 Regular gas g = 2 Super gas g = 3 Premium gas g = 4 Diesel
	 * gas
	 */
	void selectGas(int g) {
		invalidOp();
	}

	void cancel() {
		invalidOp();
	}

	void startPump() {
		invalidOp();
	}

	void pump() {
		invalidOp();
	}

	void stopPump() {
		invalidOp();
	}

	void receipt() {
		invalidOp();
	}

	void noReceipt() {
		invalidOp();
	}

	void correctPin() {
		invalidOp();
	}

	void incorrectPin() {
		invalidOp();
	}

	void Continue() {
		invalidOp();
	}

	/*
	 * Print a "not allowed" message
	 */
	private void invalidOp() {
		System.out.println("Sorry selected operation is not allowed in the current state.!!!");
		System.out.println("Please try again with other operation!!!");
	}
}
