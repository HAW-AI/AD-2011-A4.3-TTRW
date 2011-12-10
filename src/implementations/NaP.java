package implementations;

import interfaces.Program;

final class NaP implements Program {

	private final static Program instance = new NaP(); 
	
	private NaP() {}
	
	public static Program newInstance() {
		return instance;
	}
	
	@Override
	public void exec() {
		System.out.println(toString());
	}

	@Override
	public int getCounter() {
		return 0;
	}
	
	@Override
	public void decreaseCounter() {}

	@Override
	public void increaseCounter() {}
	
	@Override
	public String toString() {
		return "Not a Program";
	}
}
