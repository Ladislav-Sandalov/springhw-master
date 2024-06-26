package springhw.Read_File;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Singleton.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReadFileVideoCard {
    String method = "ReadFileVideoCard()";
    private List<String> videoCard = new ArrayList<String>();
    private int count;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public ReadFileVideoCard() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);
        //logger.Start(method);
        FileReader fileVideoCard = new FileReader("C:/files/VideoCard.txt");
        Scanner readVideo = new Scanner(fileVideoCard);
        while(readVideo.hasNextLine()){
            videoCard.add(readVideo.nextLine());
        }
        //logger.End(method);
    }
    public String ManualInput(){
        int i = 0;
        System.out.println("Видеокарты: " );
        while(i < videoCard.size()){
            System.out.println(i + " - " + videoCard.get(i).replace(";", ", "));
            i++;
        }
        Scanner video= new Scanner(System.in);
        System.out.print("Введите свой вариант: " );
        String line = video.nextLine();
        count = Integer.parseInt(line);
        return videoCard.get(count);
    }

    public String RandomInput(){
        count = videoCard.size();
        Random rand = new Random();
        int randNumb = rand.nextInt(count);
        return videoCard.get(randNumb);
    }

}
