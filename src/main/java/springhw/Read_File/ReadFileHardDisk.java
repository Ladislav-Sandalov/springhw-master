package springhw.Read_File;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Singleton.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReadFileHardDisk {
    private List<String> hardDisk = new ArrayList<String>();

    private int count;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");

    public ReadFileHardDisk() throws FileNotFoundException {
        Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "ReadFileHardDisk()";
        logger.Start(method);
        FileReader fileHardDisk = new FileReader("C:/files/HardDisk.txt");
        Scanner readDisk = new Scanner(fileHardDisk);
        while(readDisk.hasNextLine()){
            hardDisk.add(readDisk.nextLine());
        }
        logger.End(method);
    }
    public String ManualInput(){
        int i = 0;
        System.out.println("Диски: " );
        while(i < hardDisk.size()){
            System.out.println(i + " - " + hardDisk.get(i).replace(";", ", "));
            i++;
        }
        Scanner disk = new Scanner(System.in);
        System.out.print("Введите свой выбор " );
        String line = disk.nextLine();
        count = Integer.parseInt(line);
        return hardDisk.get(count);
    }

    public String RandomInput(){
        count = hardDisk.size();
        Random rand = new Random();
        int randNumb = rand.nextInt(count);
        return hardDisk.get(randNumb);
    }
}
