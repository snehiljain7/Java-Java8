package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.stage.PopupWindow;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter printWriter = new PrintWriter("abc.txt");
			printWriter.print(false);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
