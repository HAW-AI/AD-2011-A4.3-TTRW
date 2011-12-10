package implementations;

import interfaces.Command;

final class WClass implements Command {
	
	private static Command instance = new WClass();
	
	private WClass() {}
	
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
