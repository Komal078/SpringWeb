package io.cts.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import io.cts.entity.User;
import io.cts.user.CrmUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
