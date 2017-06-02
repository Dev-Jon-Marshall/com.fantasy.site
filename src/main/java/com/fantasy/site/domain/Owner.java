package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ownerId")
    private Integer ownerId;

    @Version
    private Integer version;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ContactInfo contactInfo;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private User user;


    public Owner () {}

    public Owner (String firstName, String lastName)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public Owner(String firstName, String lastName, ContactInfo contactInfo, User user)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setContactInfo(contactInfo);
        this.setUser(user);

    }

    private Integer setDefaultEnabled(Integer enabledInput)
    {
        if(enabledInput != 2)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }


    public Integer getOwnerId()
    {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId)
    {
        this.ownerId = ownerId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public ContactInfo getContactInfo()
    {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo)
    {
        this.contactInfo = contactInfo;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
