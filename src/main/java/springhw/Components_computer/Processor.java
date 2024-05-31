package springhw.Components_computer;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Confugurator.ComponentManual;
import springhw.Read_File.ReadFileProcessor;
import springhw.Singleton.Characteristics;
import springhw.Singleton.Logger;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class Processor extends ComponentManual {
    private String name;
    private String socket;
    private int countCore;
    private String DDR;
    private int powerMax;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void newCreateProcessorManual() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "newCreateProcessorManual()";
        //logger.Start(method);
        ReadFileProcessor read = ctx.getBean("ReadFileProcessor", ReadFileProcessor.class);
        String[] fullName = read.ManualInput().split(";");
        name = fullName[0];
        socket = fullName[1];
        countCore = Integer.parseInt(fullName[2].split(" ")[0]);
        DDR = fullName[3];
        powerMax = Integer.parseInt(fullName[4].split(" ")[0]);
        Characteristics characteristics = Characteristics.getInstance();
        characteristics.setSocket(socket);
        characteristics.setDDR(DDR);
        characteristics.setPowerMax(powerMax);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameProcessor(name);
        System.out.println("Создан процессор");
        //logger.End(method);
    }
    public void newCreateProcessorRandom() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "newCreateProcessorRandom()";
        //logger.Start(method);
        ReadFileProcessor read = ctx.getBean("ReadFileProcessor", ReadFileProcessor.class);
        String[] fullName = read.RandomInput().split(";");
        name = fullName[0];
        socket = fullName[1];
        countCore = Integer.parseInt(fullName[2].split(" ")[0]);
        DDR = fullName[3];
        powerMax = Integer.parseInt(fullName[4].split(" ")[0]);
        Characteristics characteristics = Characteristics.getInstance();
        characteristics.setSocket(socket);
        characteristics.setDDR(DDR);
        characteristics.setPowerMax(powerMax);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameProcessor(name);
        System.out.println("Создан процессор");
        //logger.End(method);
    }

    public String getName() {
        return name;
    }
}
