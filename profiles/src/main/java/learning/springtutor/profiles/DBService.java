package learning.springtutor.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBService {
	
	@Autowired
	private DBConfiguration dbConfiguration;
	
	
	public void execute() {
		System.out.println(dbConfiguration.dbDetails());
	}

}
