package springhw.Components_computer;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Confugurator.ComponentManual;
import springhw.Read_File.ReadFileVideoCard;
import springhw.Singleton.Characteristics;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;

public class VideoCard extends ComponentManual {
    private String name;
    private int videoRAM;
    private int powerMax = 0;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void newCreateVideoCardManual() throws FileNotFoundException {
        ReadFileVideoCard read = ctx.getBean("ReadFileVideoCard", ReadFileVideoCard.class);
        String[] fullName = read.ManualInput().split(";");
        name = fullName[0];
        videoRAM = Integer.parseInt(fullName[1].split(" ")[0]);
        powerMax = Integer.parseInt(fullName[2].split(" ")[0]);
        Characteristics characteristics = Characteristics.getInstance();
        characteristics.setPowerMax(powerMax);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameVideoCard(name);
        System.out.println("Создана видеокарта");
    }

    public void newCreateVideoCardRandom() throws FileNotFoundException {
        ReadFileVideoCard read = ctx.getBean("ReadFileVideoCard", ReadFileVideoCard.class);
        String[] fullName = read.RandomInput().split(";");
        name = fullName[0];
        videoRAM = Integer.parseInt(fullName[1].split(" ")[0]);
        powerMax = Integer.parseInt(fullName[2].split(" ")[0]);
        Characteristics characteristics = Characteristics.getInstance();
        characteristics.setPowerMax(powerMax);
        NameComponents nameComponents = NameComponents.getInstance();
        nameComponents.setNameVideoCard(name);
        System.out.println("Создана видеокарта");
    }

    public String getName() {
        return name;
    }
}
