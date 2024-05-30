package springhw.Disk_Modul;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public interface IHard_Disk {
    public void newCreateHardDiskManual() throws FileNotFoundException;
    public void newCreateHardDiskRandom() throws FileNotFoundException;
}
