package springhw.beans;

public class HelloBean {
	private String name;

	//Конструкторы
	public HelloBean() {}
	public HelloBean(String name) {
		super();
		this.name = name;
	}

	// static Фабричный метод
	public static HelloBean getHelloBean(String name) {		
		return new HelloBean(name+"   (Тут вызываем конструктор из фабричного метода)");
	}
	
  	//Getter
	public String getName() {
		return name;
	}
	//Setter	
	public void setName(String name) {
		this.name = name;
	}

	//Печать объекта в строку
	@Override
	public String toString() {
		return "HelloBean [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
