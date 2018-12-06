package demo.maven.learning.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


@Mojo(name="add")
public class Addition extends AbstractMojo{
	
	@Parameter(property="add.num1")
	private Integer num1;
	@Parameter(property="add.num2")
	private Integer num2;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		
		getLog().info( "Sum of "+num1+" and "+num2+" is "+(num1+num2));
		
	}

}
