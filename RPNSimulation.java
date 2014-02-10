import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RPNSimulation {

	public static void main(String[] args) throws MidiDataOutOfRangeException,
			DivideZeroException, MidiNumberException, IOException,
			InvalidInputTypeException, StackNumbersException {
		String str = null;
		int num;
		Caculator myCal = new Caculator();

		System.out.println("Welcome to the RPN simulator!");
		System.out
				.println("You can type numbers or operators (+, -, *, /, pop, clear, midi, quit)");

		while (true) {
			System.out.println("+- STACK -- top ---------+");
			myCal.printing();
			System.out.print("+--------- bottom -------+");
			System.out.print("Input: ");
			System.out.println();
			
			try {
				str = getString();

				if (str.equals("+") || str.equals("-") || str.equals("*")
						|| str.equals("/")) {
					myCal.calculate(str);
				} else if (isNumeric(str)) {
					num = Integer.parseInt(str);
					myCal.input(num);
				} else if (str.equals("pop")) {
					myCal.pop();
				} else if (str.equals("clear")) {
					myCal.clear();
				} else if (str.equals("midi")) {
					myCal.midi();
				} else if (str.equals("quit")) {
					break;
				}
			}
			 catch (InvalidInputTypeException e) {
				 System.err.println(e);
			 } 
			catch (MidiNumberException e) {
				System.err.println(e);
			}
			catch (MidiDataOutOfRangeException e) {
				System.err.println(e);
			}
			catch (StackNumbersException e) {
				System.err.println(e);
			}
			catch (DivideZeroException e) {
				System.err.println(e);
			}
		}

	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	public static String getString() throws IOException,
			InvalidInputTypeException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
