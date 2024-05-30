package springhw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springhw.configurationbeans.Computer;
import springhw.configurationbeans.SpringConfig;

public class AppConfiguration {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		ctx.getBean("computer",Computer.class).print();
		ctx.close();
	}

}
