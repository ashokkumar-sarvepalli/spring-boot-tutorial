package learning.spring.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import learning.spring.model.TextEditor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfiguration.class);

		System.out.println(context.containsBean("linuxSpellChecker"));
		System.out.println(context.containsBean("dfa"));
		
		TextEditor bean = (TextEditor) context.getBean("textEditor");

		bean.spellCheck();
	}
}
