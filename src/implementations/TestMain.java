package implementations;

import interfaces.Program;

public class TestMain {

	public static void main(String[] args) {
		Program p1 = Utility.Program("W+W+WCPC", 0);
		p1.exec();
		
		Program p2 = Utility.Program("W--CaP+++C", 0);
		p2.exec();
	}

}
