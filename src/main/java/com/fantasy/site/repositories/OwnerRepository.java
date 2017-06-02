package com.fantasy.site.repositories;

import com.fantasy.site.domain.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
public interface OwnerRepository extends CrudRepository<Owner, Integer>
{
    Owner findByContactInfoContactInfoId(Integer contactInfoId);

}
