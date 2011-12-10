package implementations;

import interfaces.Command;
import interfaces.Program;

final class PClass implements Command {
	
	private final Program p;
	
	private PClass(Program p) {
		this.p = p;
	}
	
	public static Command newInstance(Program p) {
		if (p == null)
			return Utility.NaC();
		return new PClass(p);
	}

	@Override
	public void exec() {
		System.out.println(p.toString());
	}
	
	@Override
	public String toString() {
		return "P";
	}
	
}
