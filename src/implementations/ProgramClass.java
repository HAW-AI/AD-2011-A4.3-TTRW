package implementations;

import java.util.ArrayList;
import java.util.List;

import interfaces.Command;
import interfaces.Program;

final class ProgramClass implements Program {
	
	private final List<Command> commands = new ArrayList<Command>();
	private int counter;
	private final String source;
	
	private ProgramClass(String source, int counter) {
		for (char c : source.toCharArray()) {
			if (c == '+') // + (Plus)
				commands.add(Utility.I(this));
			else if (c == '-') // - (Minus)
				commands.add(Utility.D(this));
			else if (c == 'C') // C (Counter)
				commands.add(Utility.C(this));
			else if (c == 'P') // P (Program)
				commands.add(Utility.P(this));			
			else if (c == 'W') // W (Weihnachten)
				commands.add(Utility.W());
			else
				commands.add(Utility.NaC());
		}
		this.counter = counter;
		this.source = source;
	}
	
	public static Program newInstance(String source, int counter) {
		if (source == null)
			Utility.NaP();
		return new ProgramClass(source, counter);
	}
	 
	public void exec() {
		for (Command c : commands) {
			c.exec();
		}
	}

	@Override
	public int getCounter() {
		return counter;
	}

	@Override
	public void increaseCounter() {
		counter++;
	}
	
	@Override
	public void decreaseCounter() {
		counter--;
	}
	
	@Override
	public String toString() {
		return source;
	}
}
