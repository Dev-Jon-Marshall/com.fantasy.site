package com.fantasy.site.services;

import com.fantasy.site.domain.League;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface LeagueService
{
    Iterable<League> listAllLeagues();

    League getLeagueById(Integer id);

    League saveLeague(League league);

    Iterable<League> saveLeagueList(Iterable<League> leagueIterable);

    void deleteLeague(Integer id);

    Integer getLeagueIdByLeagueName(String leagueName);


}
