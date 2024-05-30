package springhw.Computer;






import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Confugurator.ComponentManual;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class Manual {
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void createManual() throws FileNotFoundException {
        ComponentManual component = ctx.getBean("ComponentManual", ComponentManual.class);
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
