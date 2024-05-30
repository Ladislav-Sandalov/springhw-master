package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans.HelloBean;

public class App {

	public static void main(String[] args) {
		
		// Создаем контекст приложения из xml файла("src/main/resources/applicationContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //-----------------------------------------------------------------------------------------------------------------------------------------------------
        
        // Считываем бины (объекты) и печатаем их в консоль
        System.out.println(ctx.getBean("firstBean", HelloBean.class));
        System.out.println(ctx.getBean("secondBean", HelloBean.class));
        
           // Можете посмотреть в консоли, что два раза напечатан один и тот же объект с id=="thirdBean", потому что у него по умолчанию scope == "singleton"
           // Смотрите код ссылки на метод toString, которая выводится в конце каждой строчки. Они одинаковые   
        System.out.println(ctx.getBean("thirdBean", HelloBean.class));
        System.out.println(ctx.getBean("thirdBean", HelloBean.class));
        
           // Можете посмотреть в консоли, что по одному разу напечатаны две разных копии бина с id=="fourthBean", потому что у него установлен scope == "prototype"
           // Смотрите код ссылки на метод toString, которая выводится в конце каждой строчки. Они разные
        System.out.println(ctx.getBean("fourthBean", HelloBean.class));
        System.out.println(ctx.getBean("fourthBean", HelloBean.class));

        //-----------------------------------------------------------------------------------------------------------------------------------------------------
        
        // Закрываем контекст приложения 
        ctx.close();
	}

}