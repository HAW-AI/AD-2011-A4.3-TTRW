package implementations;

import interfaces.Command;
import interfaces.Program;

final class ICommand implements Command {

	private final Program p;
	
	private ICommand(Program p) {
		this.p = p;
	}
	
	public static Command newInstance(Program p) {
		if (p == null)
			Utility.NaC();
		return new ICommand(p);
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
