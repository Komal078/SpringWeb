package io.cts.dao;

import io.cts.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
