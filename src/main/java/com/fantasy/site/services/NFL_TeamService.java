package com.fantasy.site.services;

import com.fantasy.site.domain.NFL_Team;

import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface NFL_TeamService
{
    Iterable<NFL_Team> listAllNFL_Team();

    NFL_Team getNFL_TeamById(Integer id);

    NFL_Team saveNFL_Team(NFL_Team nfl_Team);

    Iterable<NFL_Team> saveNFL_TeamList(Iterable<NFL_Team> nfl_TeamIterable);

    void deleteNFL_Team(Integer id);


    //CUSTOM METHODS
    List<NFL_Team> listNFLTeams();
}
