package ExceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			float a = 10/0;
			System.out.print(a);
		}
		catch(ArithmeticException exception) {
			exception.printStackTrace();
		}
		catch(Exception e) {							//order of exception class is important
			e.printStackTrace();
		}

	}

}
