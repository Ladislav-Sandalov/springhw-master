package springhw.scanbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("tp")
@PropertySource("topicpart.properties")
public class TheoreticalPart implements ITopicPart {	
	private String content;

	public String getContent() {
		return content;
	}

	@Value("${tp.content}")
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "TheoreticalPart [getContent()=" + getContent() + "]";
	}
	
}
