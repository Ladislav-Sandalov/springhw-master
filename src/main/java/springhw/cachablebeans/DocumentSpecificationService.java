package springhw.cachablebeans;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component("dsservice")
public class DocumentSpecificationService implements IDocumentSpecificationService  {

	@Cacheable("docspec")
	public DocumentSpecification getByName(String name) {
		lookUpOpSim();
		System.out.println("Из запроса");
		return new DocumentSpecification(name);
	}
	
	@CacheEvict(value = "docspec", allEntries = true)
	public void refreshAll() {
		
	}
	
	private void lookUpOpSim() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
