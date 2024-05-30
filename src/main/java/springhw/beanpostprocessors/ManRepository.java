package springhw.beanpostprocessors;

import org.springframework.stereotype.Component;


@Component
public class ManRepository {

	@Override
	public String toString() {
		return "ManRepository [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}
