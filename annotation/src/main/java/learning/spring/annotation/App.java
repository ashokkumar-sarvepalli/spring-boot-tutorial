package learning.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfiguration.class);
        
    	System.out.println(context.containsBean("linuxspellchecker"));
    	System.out.println(context.containsBean("dfa"));

    	
    	TextEditor bean = (TextEditor) context.getBean("texteditor");
        
        bean.spellCheck();
    }
}
