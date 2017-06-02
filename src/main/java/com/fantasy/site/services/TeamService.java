package com.fantasy.site.services;

import com.fantasy.site.domain.Team;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface TeamService
{
    Iterable<Team> listAllTeam();

    Team getTeamById(Integer id);

    Team saveTeam(Team team);

    Iterable<Team> saveTeamList(Iterable<Team> teamIterable);

    void deleteTeam(Integer id);
}
