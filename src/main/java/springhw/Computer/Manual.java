package springhw.Computer;






import springhw.Confugurator.ComponentManual;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class Manual {

    public void createManual() throws FileNotFoundException {
        ComponentManual component = new ComponentManual();
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
