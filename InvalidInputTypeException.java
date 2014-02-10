
public class InvalidInputTypeException extends Exception {
	
	String str;
	
	public InvalidInputTypeException (String badstr) {
		
	   
	    super("Error! " + badstr + " is not a number or operator (+, -, *, /, pop, clear, midi, quit)");
	    str = badstr;
	}

}
