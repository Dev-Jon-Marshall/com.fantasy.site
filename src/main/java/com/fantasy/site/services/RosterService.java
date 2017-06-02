package com.fantasy.site.services;

import com.fantasy.site.domain.Roster;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface RosterService
{
    Iterable<Roster> listAllRoster();

    Roster getRosterById(Integer id);

    Roster saveRoster(Roster roster);

    Iterable<Roster> saveRosterList(Iterable<Roster> rosterIterable);

    void deleteRoster(Integer id);
}
