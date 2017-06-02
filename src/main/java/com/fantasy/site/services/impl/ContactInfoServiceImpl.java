package com.fantasy.site.services.impl;

import com.fantasy.site.domain.ContactInfo;
import com.fantasy.site.repositories.ContactInfoRepository;
import com.fantasy.site.services.ContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jonathan.Marshall on 4/4/2017.
 */
@Service
public class ContactInfoServiceImpl implements ContactInfoService
{
    @Autowired
    private ContactInfoRepository contactInfoRepository;

    @Override
    public Iterable<ContactInfo> listAllContactInfo()
    {
        return contactInfoRepository.findAll();
    }

    @Override
    public ContactInfo getContactInfoById(Integer id)
    {
        return contactInfoRepository.findOne(id);
    }

    @Override
    public ContactInfo saveContactInfo(ContactInfo contactInfo)
    {
        return contactInfoRepository.save(contactInfo);
    }

    @Override
    public Iterable<ContactInfo> saveContactInfoList(Iterable<ContactInfo> contactInfoIterable)
    {
        return contactInfoRepository.save(contactInfoIterable);
    }

    @Override
    public void deleteContactInfo(Integer id)
    {
        contactInfoRepository.delete(id);
    }

    @Override
    public ContactInfo getContactInfoByEmailAddress(String emailAddress)
{
    return contactInfoRepository.findByEmailAddress(emailAddress);
}
}
