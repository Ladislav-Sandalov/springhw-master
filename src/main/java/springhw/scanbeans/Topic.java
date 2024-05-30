package springhw.scanbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("idTopic")
public class Topic {

	//List<ITopicPart> tpl =  new ArrayList<ITopicPart>();
    ITopicPart tp;
	
	/*public Topic(List<ITopicPart> tpl) {
		super();
		this.tpl = tpl;
    }*/
	
	@Autowired	
	public Topic(@Qualifier("tp") ITopicPart tp) {
		super();
		this.tp = tp;
    }
	

	@Override
	public String toString() {
		//return "Topic [tpl=" + tpl + "]";
		return "Topic [tp=" + tp + "]";
	}
	  
}
