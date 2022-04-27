package ExceptionHandling;


class HelloWorld {
    public static void main(String[] args) {
        try {
        	Float a= new Float("3.0");
        	int x = a.intValue();
        	byte b = a.byteValue();
        	double d = a.doubleValue();
        	System.out.println(x+b+d);
        	
        }
        catch(NumberFormatException e) {
        	
        }
    }
}