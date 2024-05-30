package springhw.Singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logger {
    public void Start(String line){
        System.out.println("Начало работы метода " + line);
    }
    public void End(String line){
        System.out.println("Конец работы метода " + line);
    }
}
