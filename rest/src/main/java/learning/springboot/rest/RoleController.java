package learning.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	
	@Autowired
	private RoleRepository repository;
	
	@Value("${allowregion}")
	private String allowedCountry;

	@RequestMapping(value = "/roles", method = RequestMethod.GET, produces = { "application/json", "application/xml" })
	public List<Role> findAllRoles() {
		List<Role> roleList = new ArrayList<>();
		if(allowedCountry.equalsIgnoreCase("India"))
		repository.findAll().forEach(r -> roleList.add(r));
		else
			roleList.add(new Role());
		return roleList;

	}
}
