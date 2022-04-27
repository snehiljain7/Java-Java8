package ExceptionHandling;

import java.util.Scanner;

class InsufficientAmountException extends RuntimeException{

	public InsufficientAmountException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsufficientAmountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InsufficientAmountException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InsufficientAmountException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InsufficientAmountException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
public class CustomisedException {

	long balance;
	public CustomisedException(long balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void Validate(CustomisedException obj, long reqAmount) throws InsufficientAmountException {
		if(reqAmount > obj.getBalance()) {
			throw new InsufficientAmountException("Insufficient amount");
		}
		else {
			long updatedBalance = obj.getBalance()-reqAmount;
			obj.setBalance(updatedBalance);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomisedException obj = new CustomisedException(10000);
		Scanner scanner = new Scanner(System.in);
		long reqAmount = scanner.nextLong();
		
		try {
			obj.Validate(obj, reqAmount);
		}
		catch(InsufficientAmountException ex) {
			System.out.println("Exception occurred " + ex);
		}
		scanner.close();
	}

}
