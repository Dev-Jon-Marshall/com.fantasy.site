package com.fantasy.site.services;


import com.fantasy.site.domain.User;

/**
 * Created by Jonathan.Marshall on 6/1/2017.
 */
public interface UserService
{
    void save(User user);

    User findByUsername(String username);
}
