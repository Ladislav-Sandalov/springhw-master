package springhw.Disk_Modul;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Read_File.ReadFileHardDisk;

import java.io.FileNotFoundException;

public class Hard_Disk_Tree implements IHard_Disk {
    private String name;
    private int memory;
    public ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");

    public void newCreateHardDiskManual() throws FileNotFoundException {
        ReadFileHardDisk read = ctx.getBean("ReadFileHardDisk", ReadFileHardDisk.class);
//        ReadFileHardDisk read = new ReadFileHardDisk();
        String[] fullName = read.ManualInput().split(";");
        name = fullName[0];
        memory = Integer.parseInt(fullName[1].split(" ")[0]);
        System.out.println("Создан жесткий диск");
    }
    public void newCreateHardDiskRandom() throws FileNotFoundException {
        ReadFileHardDisk read = ctx.getBean("ReadFileHardDisk", ReadFileHardDisk.class);
//        ReadFileHardDisk read = new ReadFileHardDisk();
        String[] fullName = read.RandomInput().split(";");
        name = fullName[0];
        memory = Integer.parseInt(fullName[1].split(" ")[0]);
        System.out.println("Создан жесткий диск");
    }
    public String getName() {
        return name;
    }
}
