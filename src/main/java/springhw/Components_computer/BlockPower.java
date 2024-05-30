package springhw.Components_computer;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Confugurator.ComponentManual;
import springhw.Factory.Creator;
import springhw.Read_File.ReadFileBlockPower;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class BlockPower extends ComponentManual {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    private String name;
    private int powerMax;
    public void newCreateBlockPowerManual() throws FileNotFoundException {

        ReadFileBlockPower read = ctx.getBean("blockpower", ReadFileBlockPower.class);
        String[] fullName = read.ManualInput().split(";");
        name = fullName[0];
        powerMax = Integer.parseInt(fullName[1].split(" ")[0]);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameBlockPower(name);
        System.out.println("Создан блок питания");
    }
    public void newCreateBlockPowerRandom() throws FileNotFoundException {
        ReadFileBlockPower read = new ReadFileBlockPower();
        String[] fullName = read.RandomInput().split(";");
        name = fullName[0];
        powerMax = Integer.parseInt(fullName[1].split(" ")[0]);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameBlockPower(name);
        System.out.println("Создан блок питания");
    }

    public String getName() {
        return name;
    }
}
