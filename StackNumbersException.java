
public class StackNumbersException extends Exception {
	String str;
	
	public StackNumbersException (String badstr) {
		super("Error! The stack must have at least two numbers for" + badstr + "to work....");
	    str = badstr;
	}

}
