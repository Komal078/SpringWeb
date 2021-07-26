package io.com.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import io.com.entity.User;
import io.com.user.CrmUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
