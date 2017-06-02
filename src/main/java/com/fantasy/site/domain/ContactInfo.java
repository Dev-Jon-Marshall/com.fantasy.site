package com.fantasy.site.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class ContactInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContactInfoId")
    private Integer contactInfoId;

    @Version
    private Integer version;

    @Column(name = "EmailAddress")
    private String emailAddress;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    public ContactInfo()
    {
    }

    public ContactInfo(String emailAddress)
    {
        this.setEmailAddress(emailAddress);
    }

    public ContactInfo(String emailAddress, String phoneNumber)
    {
        this.setEmailAddress(emailAddress);
        this.setPhoneNumber(phoneNumber);
    }


    public Integer getContactInfoId()
    {
        return contactInfoId;
    }

    public void setContactInfoId(Integer contactInfoId)
    {
        this.contactInfoId = contactInfoId;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

}
