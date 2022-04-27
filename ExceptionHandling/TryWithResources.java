package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileReader fileReader = new FileReader("D:\\Java Programming\\Learning\\HelloWorld\\bin\\ExceptionHandling\\abc.txt"))
		{
			int i;
			while ((i = fileReader.read()) != -1)
				 
	            // Print all the content of a file
	            {System.out.print((char)i);}
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
