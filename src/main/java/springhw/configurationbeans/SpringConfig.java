package springhw.configurationbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class SpringConfig {
    	
	// Создаем бины принтеров
	// @Bean - Замена <bean>...</bean>
	
	@Bean
	public SMSPrinter smsPrinter() {
		return new SMSPrinter();
	}

	@Bean
	public VKPrinter vkPrinter() {
		return new VKPrinter();
	}
    
	// Внедряем завимость (конфигурируем подключение принтера к компьютеру)
	@Bean
	public Computer computer() {
		return new Computer(vkPrinter());
	}
	
}
