package com.fantasy.site.repositories;

import com.fantasy.site.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 5/17/2017.
 */
public interface RoleRepository extends JpaRepository<Role, Long>
{
    @Query(value = "select a.role from user_roles a " +
            "inner join users b on a.user_id_userid = b.userid " +
            "where b.username = :userName"
            , nativeQuery = true)
    public List<String>findRoleByUserName(@Param("userName") String username);

    public List<Role> findRoleByName(String name);
}
