package springhw.cachablebeans;

public interface IDocumentSpecificationService {
	public DocumentSpecification getByName(String name);
	public void refreshAll();
}
