package com.fantasy.site.services.impl;

import com.fantasy.site.domain.Role;
import com.fantasy.site.domain.User;
import com.fantasy.site.repositories.RoleRepository;
import com.fantasy.site.repositories.UserRepository;
import com.fantasy.site.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 6/1/2017.
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {

        String defaultUser = "USER";
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        // get a list of all roles in DB
        List<Role> roleList = roleRepository.findAll();

        // convert list of roles to hashset
        HashSet<Role> availableRoles = new HashSet<>(roleList);

        // Below lines add all available or specific roles in db to user.
        //user.setRoles(new HashSet<>(roleRepository.findAll()));
        user.setRoles(new HashSet<>(roleRepository.findRoleByName(defaultUser)));

        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
