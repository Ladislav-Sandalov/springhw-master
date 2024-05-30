package springhw;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springhw.cachablebeans.BeanCacheConfig;
import springhw.cachablebeans.IDocumentSpecificationService;

public class AppDocSpecCache {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanCacheConfig.class);
		IDocumentSpecificationService dss = (IDocumentSpecificationService)ctx.getBean("dsservice");
		
		System.out.println(dss.getByName("XML"));		
		System.out.println(dss.getByName("XML"));
		System.out.println(dss.getByName("XML"));
	    
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(dss.getByName("XML"));		
		System.out.println(dss.getByName("XML"));
		
		dss.refreshAll();
		
		System.out.println(dss.getByName("XML"));		
		System.out.println(dss.getByName("XML"));
		System.out.println(dss.getByName("XML"));		
		System.out.println(dss.getByName("XML"));
		
		ctx.close(); 
	}

}
