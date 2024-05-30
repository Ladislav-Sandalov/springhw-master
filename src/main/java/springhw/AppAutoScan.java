package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springhw.beans.HelloBean;
import springhw.scanbeans.ITopicPart;
import springhw.scanbeans.PracticalPart;
import springhw.scanbeans.Topic;

public class AppAutoScan {

	public static void main(String[] args) {
		// Создаем контекст приложения из xml файла("src/main/resources/applicationContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appAutoscanContext.xml");
        // Считываем бин (объект)
        Topic t = ctx.getBean("idTopic", Topic.class);             
        
        // Печатаем объект в консоль
        System.out.println(t);
        // Закрываем контекст приложения 
        ctx.close();

	}

}
