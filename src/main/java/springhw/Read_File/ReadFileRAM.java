package springhw.Read_File;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Singleton.Characteristics;
import springhw.Singleton.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReadFileRAM {
    String method = "ReadFileRAM()";
    private List<String> RAM = new ArrayList<String>();

    private int count;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public ReadFileRAM() throws FileNotFoundException {
        //Logger logger = ctx.getBean("Logger", Logger.class);

        //logger.Start(method);
        FileReader fileRAM = new FileReader("C:/files/RAM.txt");
        Scanner readRAM = new Scanner(fileRAM);
        String temp_line;
        Characteristics characteristics = Characteristics.getInstance();
        String DDR = characteristics.getDDR();
        String temp_DDR;
        while(readRAM.hasNextLine()){
            temp_line = readRAM.nextLine();
            temp_DDR = temp_line.split(";")[2];
            if(temp_DDR.equals(DDR)) {
                RAM.add(temp_line);
            }
        }
        //logger.End(method);
    }
    public String ManualInput(){
        int i = 0;
        System.out.println("ОЗУ: " );
        while(i < RAM.size()){
            System.out.println(i + " - " + RAM.get(i).replace(";", ", "));
            i++;
        }
        Scanner processor = new Scanner(System.in);
        System.out.print("Введите свой вариант " );
        String line = processor.nextLine();
        count = Integer.parseInt(line);
        return RAM.get(count);
    }

    public String RandomInput(){
        count = RAM.size();
        Random rand = new Random();
        int randNumb = rand.nextInt(count);
        return RAM.get(randNumb);
    }
}
