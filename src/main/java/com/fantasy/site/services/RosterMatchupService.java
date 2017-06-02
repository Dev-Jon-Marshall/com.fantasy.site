package com.fantasy.site.services;

import com.fantasy.site.domain.RosterMatchup;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface RosterMatchupService
{
    Iterable<RosterMatchup> listAllRosterMatchup();

    RosterMatchup getRosterMatchupById(Integer id);

    RosterMatchup saveRosterMatchup(RosterMatchup rosterMatchup);

    Iterable<RosterMatchup> saveRosterMatchupList(Iterable<RosterMatchup> rosterMatchupIterable);

    void deleteRosterMatchup(Integer id);
}   
