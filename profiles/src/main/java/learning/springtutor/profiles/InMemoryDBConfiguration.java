package learning.springtutor.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class InMemoryDBConfiguration implements DBConfiguration{

	
	public String dbDetails() {
		return "inmemory db configuration";
	}
}
