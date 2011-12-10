package implementations;

import interfaces.Command;
import interfaces.Program;

final class IClass implements Command {

	private final Program p;
	
	private IClass(Program p) {
		this.p = p;
	}
	
	public static Command newInstance(Program p) {
		if (p == null)
			Utility.NaC();
		return new IClass(p);
	}
	
	@Override
	public void exec() {
		p.increaseCounter();
	}
	
	@Override
	public String toString() {
		return "+";
	}
	
}
