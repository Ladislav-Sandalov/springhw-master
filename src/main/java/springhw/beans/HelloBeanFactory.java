package springhw.beans;

public class HelloBeanFactory{
	public HelloBean getHelloBeanExt(String name) {
		return new HelloBean(name+ "(  Этот бин создан внешним фабричным методом)");
	}   
	
}
