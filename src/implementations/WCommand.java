package implementations;

import interfaces.Command;

final class WCommand implements Command {
	
	private static Command instance = new WCommand();
	
	private WCommand() {}
	
	public static Command newInstance() {
		return instance;
	}
	
	@Override
	public void exec() {
		System.out.println("Frohe Weihnachten!");
	}
	
	@Override
	public String toString() {
		return "W";
	}
	
}
