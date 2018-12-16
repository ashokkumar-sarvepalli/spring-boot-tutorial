package learning.springtutor.hibernate.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import learning.springtutor.hibernate.dao.RoleDAO;
import learning.springtutor.hibernate.model.Role;

@Service("roleservice")
@Transactional
public class RoleService {
	
	@Autowired
	private RoleDAO roleDAO;
	
	
	public List<Role> findAllRoles(){
		return roleDAO.findAllRoles();
	}
	
	

}
