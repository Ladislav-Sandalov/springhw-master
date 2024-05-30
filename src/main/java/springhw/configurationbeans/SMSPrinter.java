package springhw.configurationbeans;

public class SMSPrinter implements Printerable {

	@Override
	public void print() {
		System.out.println("Отправлено SMS-сообщение");
	}

}
