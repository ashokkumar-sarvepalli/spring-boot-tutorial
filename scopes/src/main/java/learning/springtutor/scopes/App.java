package learning.springtutor.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import learning.springtutor.scopes.MyConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
       
    	EmployeeHandler emp1 = (EmployeeHandler) context.getBean("employeeHandler");
    	emp1.addName("rajesh");
    	emp1.addName("viswa");
    	
    	
    	PolicyHandler pol1 = (PolicyHandler) context.getBean("policyHandler");
    	
    	pol1.addName("property and liability");
    	pol1.addName("garage");
    	pol1.addName("workers compensation");
    	
    	
    	EmployeeHandler emp2 = (EmployeeHandler) context.getBean("employeeHandler");
    	emp2.addName("anurag");
    	emp2.addName("chaitu");
    	
    	
    	PolicyHandler pol2 = (PolicyHandler) context.getBean("policyHandler");
    	pol2.addName("jeevan anand");
    	pol2.addName("jeevan kush");
    	
    	System.out.println("Employee names");
    	emp2.getNames().stream().forEach(System.out::println);
    	System.out.println("Policy Names");
    	pol2.getNames().stream().forEach(System.out::println);
    	
    	
    }
}
