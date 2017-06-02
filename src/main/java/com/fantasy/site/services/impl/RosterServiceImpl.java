package com.fantasy.site.services.impl;

import com.fantasy.site.domain.Roster;
import com.fantasy.site.repositories.RosterRepository;
import com.fantasy.site.services.RosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class RosterServiceImpl implements RosterService
{
    @Autowired
    private RosterRepository rosterRepository;

    @Override
    public Iterable<Roster> listAllRoster()
    {
        return rosterRepository.findAll();
    }

    @Override
    public Roster getRosterById(Integer id)
    {
        return rosterRepository.findOne(id);
    }

    @Override
    public Roster saveRoster(Roster roster)
    {
        return rosterRepository.save(roster);
    }

    @Override
    public Iterable<Roster> saveRosterList(Iterable<Roster> rosterIterable)
    {
        return rosterRepository.save(rosterIterable);
    }

    @Override
    public void deleteRoster(Integer id)
    {
        rosterRepository.delete(id);
    }
}
