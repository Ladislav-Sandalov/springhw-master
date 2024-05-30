package springhw.Computer;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Confugurator.ComponentRandom;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class Random {
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void createRandom() throws FileNotFoundException {

        ComponentRandom component = ctx.getBean("ComponentRandom", ComponentRandom.class);
        component.createProcessor();
        component.createMatherBoard();
        component.createRAM();
        component.createVideoCard();
        component.createBlockPower();
        component.createHardDisk();

        NameComponents nameComponents = NameComponents.getInstance();
        System.out.println("");
        nameComponents.SelectComputer();
    }
}
