package learning.springtutor.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MongoDBConfiguration implements DBConfiguration {
	
	
	public String dbDetails() {
		return "Mongo db configuration";
	}

}
