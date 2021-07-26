package io.com.dao;

import io.com.entity.User;

public interface UserDao {

  public User findByUserName(String userName);
    public User findByUserId(int id);
    
    public void save(User user);
    
}
