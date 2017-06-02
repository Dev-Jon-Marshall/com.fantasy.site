package com.fantasy.site.services;

import com.fantasy.site.domain.Owner;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface OwnerService
{
    Iterable<Owner> listAllOwner();

    Owner getOwnerById(Integer id);

    Owner saveOwner(Owner owner);

    Iterable<Owner> saveOwnerList(Iterable<Owner> ownerIterable);

    void deleteOwner(Integer id);

    Owner findByContactInfoContactInfoId(Integer contactInfoId);

}
