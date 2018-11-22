package learning.spring.annotation;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
