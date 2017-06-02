package com.fantasy.site.domain;

        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

        import javax.persistence.*;
//        import java.io.Serializable;
        import java.util.Set;


/**
 * Created by Jonathan.Marshall on 5/16/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="users")
public class User
{
    private Long id;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;

    public User(){}

    public User(String username, String password)
    {
        this.setUsername(username);
        this.setPassword(password);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}