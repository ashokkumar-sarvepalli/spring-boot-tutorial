package learning.springtutor.property;

import java.util.Scanner;

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
    	
    	CountryListProperties countryListProperties = (CountryListProperties)context.getBean("countryListProperties");
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your region");
    	String region = sc.nextLine();
    	
    	
    	if(countryListProperties.isRestrictionOn()) {
    		if(countryListProperties.allowedCountries().stream().anyMatch(s->s.equalsIgnoreCase(region))) {
        		System.out.println("Welcome home page!!!");
        	}else {
        		System.out.println("This content is restricted in this region\n" + 
        				"");
        	}

    	}
    	
    	else {
    		System.out.println("Welcome home page!!!");
    	}
    	
    }
}
