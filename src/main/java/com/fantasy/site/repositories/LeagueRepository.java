package com.fantasy.site.repositories;

import com.fantasy.site.domain.League;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jonathan.Marshall on 3/30/2017.
 */
public interface LeagueRepository extends CrudRepository<League, Integer>
{
    League findByLeagueName(String leagueName);
}
