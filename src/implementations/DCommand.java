package implementations;

import interfaces.Command;
import interfaces.Program;

final class DCommand implements Command {
	
	private final Program p;
	
	private DCommand(Program p) {
		this.p = p;
	}
	
	public static Command newInstance(Program p) {
		if (p == null)
			return Utility.NaC();
		return new DCommand(p);
	}
	
	@Override
	public void exec() {
		p.decreaseCounter();
	}
	
	@Override
	public String toString() {
		return "-";
	}
}
