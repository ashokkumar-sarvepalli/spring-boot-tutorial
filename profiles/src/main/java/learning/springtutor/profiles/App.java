package learning.springtutor.profiles;

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
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    	for(String string : context.getBeanDefinitionNames())
    	{
    		System.out.println(string);
    	}
    	DBService service = (DBService) context.getBean("DBService");
    	
    	service.execute();
    }
}
