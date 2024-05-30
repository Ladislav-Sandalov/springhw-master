package springhw.configurationbeans;

public class Computer implements Printerable{
	private Printerable printer;
	
	public Computer(Printerable printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		printer.print();
	}
	
	
}
