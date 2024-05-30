package springhw.Computer;



import springhw.Confugurator.ComponentRandom;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class Random {
    public void createRandom() throws FileNotFoundException {

        ComponentRandom component = new ComponentRandom();
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
