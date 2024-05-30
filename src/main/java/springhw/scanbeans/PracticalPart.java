package springhw.scanbeans;

import org.springframework.stereotype.Component;

@Component("pp")
public class PracticalPart implements ITopicPart{

	@Override
	public String getContent() {
		return "Содержание практической части";
	}

	@Override
	public String toString() {
		return "PracticalPart [getContent()=" + getContent() + "]";
	}

	
}
