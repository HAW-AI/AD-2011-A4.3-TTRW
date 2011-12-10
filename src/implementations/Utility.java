package implementations;

import interfaces.Command;
import interfaces.Program;

public final class Utility {

	private Utility() {}
	
	public static Command C(Program p) {
		return CCommand.newInstance(p);
	}

	public static Command D(Program p) {
		return DCommand.newInstance(p);
	}
	
	public static Command I(Program p) {
		return ICommand.newInstance(p);
	}
	
	public static Command P(Program p) {
		return PCommand.newInstance(p);
	}	
	
	public static Command W() {
		return WCommand.newInstance();
	}
	
	public static Command NaC() {
		return NaC.newInstance();
	}
	
	public static Program Program(String source, int counter) {
		return ProgramClass.newInstance(source, counter);
	}
	
	public static Program NaP() {
		return NaP.newInstance();
	}
}
