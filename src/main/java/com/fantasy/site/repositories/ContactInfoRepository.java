package com.fantasy.site.repositories;

import com.fantasy.site.domain.ContactInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jonathan.Marshall on 4/4/2017.
 */
public interface ContactInfoRepository extends CrudRepository<ContactInfo, Integer>
{
    ContactInfo findByEmailAddress(String emailAddress);
}
