package springhw.RAM_Modul;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Read_File.ReadFileHardDisk;
import springhw.Read_File.ReadFileRAM;

import java.io.FileNotFoundException;

public class RAM_Four {
    private String name;
    private int countMemory;
    private String DDR;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void createRamFourManual() throws FileNotFoundException {
        ReadFileRAM read = ctx.getBean("ReadFileRAM", ReadFileRAM.class);
        String[] fullName = read.ManualInput().split(";");
        name = fullName[0];
        countMemory = Integer.parseInt(fullName[1].split(" ")[0]);
        DDR = fullName[2];

    }
    public void createRamFourRandom() throws FileNotFoundException {
        ReadFileRAM read = ctx.getBean("ReadFileRAM", ReadFileRAM.class);
        String[] fullName = read.RandomInput().split(";");
        name = fullName[0];
        countMemory = Integer.parseInt(fullName[1].split(" ")[0]);
        DDR = fullName[2];

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountMemory() {
        return countMemory;
    }

    public void setCountMemory(int countMemory) {
        this.countMemory = countMemory;
    }

    public String getDDR() {
        return DDR;
    }

    public void setDDR(String DDR) {
        this.DDR = DDR;
    }


}
