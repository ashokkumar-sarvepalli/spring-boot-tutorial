package learning.springtutor.property;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class CountryListProperties {
	
	//@Autowired
	//private Environment env;
	
	
	@Value("${country}")
	private String countries;
	
	
	@Value("#{'${country}'.split(',')}")
	private List<String> countryList;
	
	@Value("${isRestrictionOn:false}")
	private boolean isRestrictionOn;
	
	
	public List<String> allowedCountries(){
		/*List<String> myList = new ArrayList<String>();
		
		//String [] countriesList = countries.split(",");
		
		for(String str : countryList){
			myList.add(str);
		}*/
		
		return countryList;
	}


	public boolean isRestrictionOn() {
		//if(env.getProperty("isRestrictionOn").equalsIgnoreCase("true"))
		return isRestrictionOn;
	}



}
