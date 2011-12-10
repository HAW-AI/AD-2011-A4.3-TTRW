package implementations;

import interfaces.Command;
import interfaces.Program;

final class CCommand implements Command {

	private final Program p;
	
	private CCommand(Program p) {
		this.p = p;
	}
	
	public static Command newInstance(Program p) {
		if (p == null)
			return Utility.NaC();
		return new CCommand(p);
	}

	@Override
	public void exec() {
		for (int i = 1; i <= p.getCounter(); i++) {
			System.out.println(String.format("Wir zŸnden %d Kerzlein an!", i));
		}
	}
	
	@Override
	public String toString() {
		return "C";
	}
	
}
