
import java.util.Stack;

public class Caculator {
	Stack <Integer> myStack;

	public Caculator() {
		myStack = new Stack <Integer>();
	}
	
	public void input (int i) {
		myStack.push(i);
	}
	
	public void printing () {
		int l = myStack.size();
		if (l == 0) {
			System.out.println();
		} else if (l == 1) {
			
			System.out.println("|                       " + myStack.peek() + "|");
			
		} else {
			int[] temp = new int [l];
			int counter = l-1;
			
			while (!myStack.empty()) {
				temp[counter] = myStack.pop();
				System.out.println("|                       " + temp[counter] + "|");
				counter--;
			}
			for (int t : temp) {
				myStack.push(t);
			}
		}
		
	}
	
	public void calculate (String str) throws StackNumbersException, DivideZeroException {
		int result = 0;
		
		if (myStack.size() > 1) {
			int num1 = myStack.pop();
			int num2 = myStack.pop();
			if (str.equals("+") ) {
				result = num2+num1;
			} else if (str.equals("-")) {
				result = num2-num1;
			} else if (str.equals("*")) {
				result = num2 * num1;
			} else if (str.equals("/")) {
				if (num1 == 0) {
					myStack.push(num2);
					myStack.push(num1);
					throw new DivideZeroException ();
				} else {
					result = num2 / num1;
				}
			}
			
			myStack.push(result);
		} else {
			throw new StackNumbersException(str);
		}
		
	}
	
	public void pop () {
		myStack.pop();
	}
	
	public void clear() {
		while (!myStack.empty()) {
			myStack.pop();
		}
	}
	
	public void midi () throws MidiNumberException, MidiDataOutOfRangeException{
		
		if (myStack.size() < 3) {
			throw new MidiNumberException ();
		} else {
			int Instrument = myStack.pop();
			int Note = myStack.pop();
			int Duration = myStack.pop();
				
			myStack.push(Duration);
			myStack.push(Note);
			myStack.push(Instrument);
			
			if (Instrument > 400) {
				throw new MidiDataOutOfRangeException(Instrument);
			
			} else {
				System.out.println("Playing MIDI sound: Duartion = " + Duration + ", Note = " + Note + ", Instrument = " + Instrument + "...");	
			}
		}
		
		
	}

}
