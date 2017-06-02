package com.fantasy.site.repositories;

import com.fantasy.site.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jonathan.Marshall on 5/17/2017.
 */

public interface UserRepository extends JpaRepository<User, Long>
{
    User findByUsername(String username);
}
