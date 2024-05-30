package springhw.Computer;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Factory.Creator;
import springhw.beans.HelloBean;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
        Creator creator = ctx.getBean("test", Creator.class);
        creator.setRequest();
        creator.createComputer();
    }
}

