
public class MidiDataOutOfRangeException extends Exception {
	int badNum;
	public MidiDataOutOfRangeException (int i) {
		super("Error! The number" + i + "is outside of the valid MIDI data range...");
	    badNum = i;
	}

}
