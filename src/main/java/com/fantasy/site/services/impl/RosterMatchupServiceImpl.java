package com.fantasy.site.services.impl;

import com.fantasy.site.domain.RosterMatchup;
import com.fantasy.site.repositories.RosterMatchupRepository;
import com.fantasy.site.services.RosterMatchupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class RosterMatchupServiceImpl implements RosterMatchupService
{
    @Autowired
    private RosterMatchupRepository rosterMatchupRepository;

    @Override
    public Iterable<RosterMatchup> listAllRosterMatchup()
    {
        return rosterMatchupRepository.findAll();
    }

    @Override
    public RosterMatchup getRosterMatchupById(Integer id)
    {
        return rosterMatchupRepository.findOne(id);
    }

    @Override
    public RosterMatchup saveRosterMatchup(RosterMatchup rosterMatchup)
    {
        return rosterMatchupRepository.save(rosterMatchup);
    }

    @Override
    public Iterable<RosterMatchup> saveRosterMatchupList(Iterable<RosterMatchup> rosterMatchupIterable)
    {
        return rosterMatchupRepository.save(rosterMatchupIterable);
    }

    @Override
    public void deleteRosterMatchup(Integer id)
    {
        rosterMatchupRepository.delete(id);
    }
}
