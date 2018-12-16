package learning.springtutor.hibernate;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import learning.springtutor.hibernate.model.Role;
import learning.springtutor.hibernate.service.RoleService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    	RoleService service = (RoleService) context.getBean("roleservice");
    	List<Role> roleList = service.findAllRoles();
    	roleList.stream().forEach(System.out::println);
    }
}
