package learning.spring.model;

import org.springframework.stereotype.Component;

@Component
public class WindowsBasedSpellChecker implements SpellChecker{

	public void checkSpelling() {
		
		System.out.println("in windows spell checker");
		
	}

}
