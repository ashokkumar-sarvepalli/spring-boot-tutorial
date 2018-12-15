package learning.springtutor.scopes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeHandler {
	
	private List<String> names = new ArrayList<>();
	
	public void addName(String str) {
		names.add(str);
	}

	public List<String> getNames() {
		return names;
	}

	
}
