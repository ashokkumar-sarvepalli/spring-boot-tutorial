package learning.spring.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		TextEditor textEditor = (TextEditor) ctx.getBean("TextEditor");
		
		textEditor.spellCheck();

	}

}
