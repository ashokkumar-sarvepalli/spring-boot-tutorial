package learning.spring.model;

import org.springframework.stereotype.Component;

@Component
public class LinuxBasedSpellChecker implements SpellChecker{

	public void checkSpelling() {
		
		System.out.println("In linux spell checker");
	}

}
