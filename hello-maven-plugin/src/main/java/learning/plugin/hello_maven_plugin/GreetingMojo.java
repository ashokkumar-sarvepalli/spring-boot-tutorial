package learning.plugin.hello_maven_plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
 
/**
 * Says "Hi" to the user.
 *
 */
@Mojo( name = "sayhi")
public class GreetingMojo extends AbstractMojo
{
	
	@Parameter(property = "sayhi.name",defaultValue = "from maven")
    private String name;
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello, world. "+name );
    }
}
