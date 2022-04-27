package ExceptionHandling;


class ThrowExcep
{
    void fun() throws NullPointerException				//declaring exception that code might throw an exception
    {
      
            throw new NullPointerException("demo");		//throwing exception
        
      
    }
}
    
    
public class ThrowVsThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside main");
		
		try
        {
           new ThrowExcep().fun();						//calling fun
        }
        catch(NullPointerException e)					
        {
            System.out.println(e + " Caught in main.");
        }

	}

}
