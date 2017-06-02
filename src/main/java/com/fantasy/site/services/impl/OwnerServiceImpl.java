package com.fantasy.site.services.impl;

import com.fantasy.site.domain.Owner;
import com.fantasy.site.repositories.OwnerRepository;
import com.fantasy.site.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class OwnerServiceImpl implements OwnerService
{
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Iterable<Owner> listAllOwner()
    {
        return ownerRepository.findAll();
    }

    @Override
    public Owner getOwnerById(Integer id)
    {
        return ownerRepository.findOne(id);
    }

    @Override
    public Owner saveOwner(Owner owner)
    {
        return ownerRepository.save(owner);
    }

    @Override
    public Iterable<Owner> saveOwnerList(Iterable<Owner> ownerIterable)
    {
        return ownerRepository.save(ownerIterable);
    }

    @Override
    public void deleteOwner(Integer id)
    {
        ownerRepository.delete(id);
    }

    @Override
    public Owner findByContactInfoContactInfoId(Integer contactInfoId)
    {
        return ownerRepository.findByContactInfoContactInfoId(contactInfoId);
    }
}
