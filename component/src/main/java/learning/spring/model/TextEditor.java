package learning.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	
	
	@Autowired
	private WindowsBasedSpellChecker spellChecker;
	
	public TextEditor(WindowsBasedSpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
