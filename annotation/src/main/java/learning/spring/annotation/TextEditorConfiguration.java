package learning.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfiguration {
	
	
	@Bean(name="windowsspellchecker")
	public SpellChecker windowsSpecker() {
		return new WindowsBasedSpellChecker();
	}
	


	@Bean(name="linuxspellchecker")
	public SpellChecker linuxSpecker() {
		return new LinuxBasedSpellChecker();
	}
	
	
	@Bean(name="texteditor")
	public TextEditor textEditor() {
		return new TextEditor(windowsSpecker());
	}
}
