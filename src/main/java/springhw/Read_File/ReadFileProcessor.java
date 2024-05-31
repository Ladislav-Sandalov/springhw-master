package springhw.Read_File;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Singleton.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReadFileProcessor {
    private List<String> proc = new ArrayList<String>();

    private int count;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");

    public ReadFileProcessor() throws FileNotFoundException {
        Logger logger = ctx.getBean("Logger", Logger.class);
        String method = "ReadFileProcessor()";
        logger.Start(method);
        FileReader fileProcessor = new FileReader("C:/files/Processor.txt");
        Scanner readProc = new Scanner(fileProcessor);
        while(readProc.hasNextLine()){
            proc.add(readProc.nextLine());
        }
        logger.End(method);
    }
    public String ManualInput(){
        int i = 0;
        System.out.println("Процессоры: " );
        while(i < proc.size()){
            System.out.println(i + " - " + proc.get(i).replace(";", ", "));
            i++;
        }
        Scanner processor = new Scanner(System.in);
        System.out.print("Введите свой вариант " );
        String line = processor.nextLine();
        count = Integer.parseInt(line);
        return proc.get(count);
    }

    public String RandomInput(){
        count = proc.size();
        Random rand = new Random();
        int randNumb = rand.nextInt(count);
        return proc.get(randNumb);
    }

}
