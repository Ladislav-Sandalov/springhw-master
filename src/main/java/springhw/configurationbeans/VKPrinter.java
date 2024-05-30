package springhw.configurationbeans;

public class VKPrinter implements Printerable {

	@Override
	public void print() {
		System.out.println("Отправлено сообщение ВК");
	}
	

}
