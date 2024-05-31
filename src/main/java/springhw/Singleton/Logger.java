package springhw.Singleton;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Aspect
@Component
@EnableAspectJAutoProxy
public class Logger {
    @Pointcut("execution(* Components_computer..*(..))")
    public void allMethodsIn() {}

        @Before("allMethodsIn()")
        public void logBefore(JoinPoint joinPoint) {
            System.out.println("\tLogging before method execution: " + joinPoint.getSignature().getName());
        }

        @After("allMethodsIn()")
        public void logAfter(JoinPoint jp) {
        System.out.println("\tAfter method: " + jp.getSignature().getName());
    }
}
