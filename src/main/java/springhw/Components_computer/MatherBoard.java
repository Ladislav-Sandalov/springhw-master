package springhw.Components_computer;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Confugurator.ComponentManual;
import springhw.Read_File.ReadFileMatherBoard;
import springhw.Singleton.Characteristics;
import springhw.Singleton.Logger;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class MatherBoard extends ComponentManual {
    private String name;
    private String socket;
    private int countSlot;
    private String DDR;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void newCreateMatherBoardManual() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "newCreateMatherBoardManual()";
        //logger.Start(method);
        ReadFileMatherBoard read = ctx.getBean("ReadFileMatherBoard", ReadFileMatherBoard.class);
        String[] fullName = read.ManualInput().split(";");
        name = fullName[0];
        socket = fullName[1];
        countSlot = Integer.parseInt(fullName[2].split(" ")[0]);
        DDR = fullName[3];
        Characteristics characteristics = Characteristics.getInstance();
        characteristics.setCountSlot(countSlot);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameMatherBoard(name);
        System.out.println("Создана материнская плата");
        //logger.End(method);
    }
    public void newCreateMatherBoardRandom() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "newCreateMatherBoardRandom()";
        //logger.Start(method);
        ReadFileMatherBoard read = ctx.getBean("ReadFileMatherBoard", ReadFileMatherBoard.class);
        String[] fullName = read.RandomInput().split(";");
        name = fullName[0];
        socket = fullName[1];
        countSlot = Integer.parseInt(fullName[2].split(" ")[0]);
        DDR = fullName[3];
        Characteristics characteristics = Characteristics.getInstance();
        characteristics.setCountSlot(countSlot);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameMatherBoard(name);
        System.out.println("Создана материнская плата");
        //logger.End(method);
    }

    public String getName() {
        return name;
    }
}
