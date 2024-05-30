package springhw.beanpostprocessors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springhw.configurationbeans.SMSPrinter;

@Configuration
@ComponentScan("springhw.beanpostprocessors")
public class BeanPostProcessorConfig {
	
}
