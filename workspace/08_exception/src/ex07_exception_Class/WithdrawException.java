package ex07_exception_Class;

@SuppressWarnings("serial")
public class WithdrawException extends Exception {

	// field
	private int errorCode;
	
	// constructor
	public WithdrawException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	// method
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
