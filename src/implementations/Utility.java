package implementations;

import interfaces.Command;
import interfaces.Program;

public final class Utility {

	private Utility() {}
	
	public static Command C(Program p) {
		return CClass.newInstance(p);
	}

	public static Command D(Program p) {
		return DClass.newInstance(p);
	}
	
	public static Command I(Program p) {
		return IClass.newInstance(p);
	}
	
	public static Command P(Program p) {
		return PClass.newInstance(p);
	}	
	
	public static Command W() {
		return WClass.newInstance();
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
