package springhw.cachablebeans;

import java.io.Serializable;

public class DocumentSpecification implements Serializable
{
	private static final long serialVersionUID = 1L;
    private String name;

	public DocumentSpecification(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name; 
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DocumentSpecification [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
      
}
