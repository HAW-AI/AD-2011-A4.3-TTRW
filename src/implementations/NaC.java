package implementations;

import interfaces.Command;

final class NaC implements Command {
	
	private static final Command instance = new NaC();
	
	private NaC() {}
	
	public static Command newInstance() {
		return instance;
	}

	@Override
	public void exec() {}
	
	@Override
	public String toString() {
		return "Not a Command";
	}
}
