package learning.spring.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="learning.spring.model")
@PropertySource("classpath:application.properties")
public class TextEditorConfiguration {
	
	
	
}
