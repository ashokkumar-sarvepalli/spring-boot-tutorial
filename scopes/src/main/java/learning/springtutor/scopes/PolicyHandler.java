package learning.springtutor.scopes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class PolicyHandler {
	
private List<String> names = new ArrayList<>();
	
	public void addName(String str) {
		names.add(str);
	}

	public List<String> getNames() {
		return names;
	}


}
