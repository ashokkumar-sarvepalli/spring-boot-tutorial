package learning.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

	@Value("${comp.username}")
	private String userName;
	@Value("${comp.password}")
	private String password;

	@Autowired
	private WindowsBasedSpellChecker spellChecker;

	public TextEditor(WindowsBasedSpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {

		if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
			spellChecker.checkSpelling();
		}else {
			System.out.println("wrong details");
		}
	}

}
