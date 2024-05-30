package springhw.Factory;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.Computer.Manual;
import springhw.Computer.Random;
import springhw.Singleton.Director;
import springhw.Singleton.NameComponents;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Creator implements ICreator {
    private int count = 0;
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
    public void setRequest(){
        System.out.println("Выберите, какой способ сборки компьютера вам подходит:\n" +
                "0 - Ручной (Каждую деталь нужно выбирать самостоятельно)\n" +
                "1 - Существующий (Вам уже подобрали готовую сборку");
        Scanner request = new Scanner(System.in);
        System.out.print("Введите свой выбор: " );
        String line = request.nextLine();
        count += Integer.parseInt(line);
        System.out.println("");
    }
    public int getCount(){
        return count;
    }
    public void createComputer() throws FileNotFoundException {
        NameComponents nameComponents = ctx.getBean("NameComponents", NameComponents.class);
        Director director = ctx.getBean("Director", Director.class);
        if (getCount() == 0){
            Manual manual = ctx.getBean("Manual", Manual.class);
            manual.createManual();
        }
        else if (getCount() == 1){
            Random random = ctx.getBean("Random", Random.class);
            random.createRandom();
        }
    }

}
