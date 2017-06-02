package com.fantasy.site.services;

import com.fantasy.site.domain.ContactInfo;

/**
 * Created by Jonathan.Marshall on 4/4/2017.
 */
public interface ContactInfoService
{
    Iterable<ContactInfo> listAllContactInfo();

    ContactInfo getContactInfoById(Integer id);

    ContactInfo saveContactInfo(ContactInfo contactInfo);

    Iterable<ContactInfo> saveContactInfoList(Iterable<ContactInfo> contactInfoIterable);

    void deleteContactInfo(Integer id);

    ContactInfo getContactInfoByEmailAddress(String emailAddress);
}
