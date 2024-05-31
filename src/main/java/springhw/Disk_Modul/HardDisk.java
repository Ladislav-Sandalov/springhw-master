package springhw.Disk_Modul;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Singleton.Director;
import springhw.Singleton.Logger;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HardDisk {
    private Hard_Disk_One diskOne;
    private Hard_Disk_Two diskTwo;
    private Hard_Disk_Tree diskTree;
    private int count;
    public ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void newCreateHardDiskManual() throws FileNotFoundException {
        Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "newCreateHardDiskManual()";
        logger.Start(method);
        System.out.println("Сколько дисков вы хотите добавить(1, 2, 3): ");
        Scanner inputCon = new Scanner(System.in);
        String StringCount = inputCon.nextLine();
        count = Integer.parseInt(StringCount);
        NameComponents nameComponents = NameComponents.getInstance();
        Director director = ctx.getBean("Director", Director.class);
        if(count == 1){
            diskOne = ctx.getBean("Hard_Disk_One", Hard_Disk_One.class);
            diskOne.newCreateHardDiskManual();
            nameComponents.addObserver(director);
            nameComponents.addHardDisk(diskOne.getName());

        } else if(count == 2){
            diskOne = ctx.getBean("Hard_Disk_One", Hard_Disk_One.class);
            diskOne.newCreateHardDiskManual();
            diskTwo = ctx.getBean("Hard_Disk_Two", Hard_Disk_Two.class);
            diskTwo.newCreateHardDiskManual();
            nameComponents.addHardDisk(diskOne.getName());
            nameComponents.addObserver(director);
            nameComponents.addHardDisk(diskTwo.getName());
        }else if(count == 3){
            diskOne = ctx.getBean("Hard_Disk_One", Hard_Disk_One.class);
            diskOne.newCreateHardDiskManual();
            diskTwo = ctx.getBean("Hard_Disk_Two", Hard_Disk_Two.class);
            diskTwo.newCreateHardDiskManual();
            diskTree = ctx.getBean("Hard_Disk_Tree", Hard_Disk_Tree.class);
            diskTree.newCreateHardDiskManual();
            nameComponents.addHardDisk(diskOne.getName());

            nameComponents.addHardDisk(diskTwo.getName());
            nameComponents.addObserver(director);
            nameComponents.addHardDisk(diskTree.getName());
        }
        logger.End(method);
    }
    public void newCreateHardDiskRandom() throws FileNotFoundException {
        Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "newCreateHardDiskRandom()";
        logger.Start(method);
        Random rand = new Random();
        int randNumb = rand.nextInt(3) + 1;
        count = randNumb;
        NameComponents nameComponents = NameComponents.getInstance();
        Director director = ctx.getBean("Director", Director.class);
        if(count == 1){
            diskOne = ctx.getBean("Hard_Disk_One", Hard_Disk_One.class);
            diskOne.newCreateHardDiskRandom();
            nameComponents.addObserver(director);
            nameComponents.addHardDisk(diskOne.getName());
        } else if(count == 2){
            diskOne = ctx.getBean("Hard_Disk_One", Hard_Disk_One.class);
            diskOne.newCreateHardDiskRandom();
            diskTwo = ctx.getBean("Hard_Disk_Two", Hard_Disk_Two.class);
            diskTwo.newCreateHardDiskRandom();

            nameComponents.addHardDisk(diskOne.getName());
            nameComponents.addObserver(director);
            nameComponents.addHardDisk(diskTwo.getName());
        }else if(count == 3){
            diskOne = ctx.getBean("Hard_Disk_One", Hard_Disk_One.class);
            diskOne.newCreateHardDiskRandom();
            diskTwo = ctx.getBean("Hard_Disk_Two", Hard_Disk_Two.class);
            diskTwo.newCreateHardDiskRandom();
            diskTree = ctx.getBean("Hard_Disk_Tree", Hard_Disk_Tree.class);
            diskTree.newCreateHardDiskRandom();
            nameComponents.addHardDisk(diskOne.getName());
            nameComponents.addHardDisk(diskTwo.getName());
            nameComponents.addObserver(director);
            nameComponents.addHardDisk(diskTree.getName());
        }
        logger.End(method);
    }
}
