package learning.springtutor.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import learning.springtutor.hibernate.model.Role;

@Repository("roledao")
public class RoleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Role> findAllRoles() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Role.class);
		return (List<Role>) criteria.list();
	}

}
