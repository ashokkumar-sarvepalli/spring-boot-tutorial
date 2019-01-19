package learning.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@RefreshScope
public class RestApplication implements CommandLineRunner{
	
	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	String[] beans = context.getBeanDefinitionNames();
	for(String str: beans) {
		System.out.println(str);
	}
		
	}

}	

