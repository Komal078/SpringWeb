package io.com.dao;

import io.com.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
