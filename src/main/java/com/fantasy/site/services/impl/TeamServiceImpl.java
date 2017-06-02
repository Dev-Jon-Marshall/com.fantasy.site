package com.fantasy.site.services.impl;

import com.fantasy.site.domain.Team;
import com.fantasy.site.repositories.TeamRepository;
import com.fantasy.site.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
@Service
public class TeamServiceImpl implements TeamService
{
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Iterable<Team> listAllTeam()
    {
        return teamRepository.findAll();
    }

    @Override
    public Team getTeamById(Integer id)
    {
        return teamRepository.findOne(id);
    }

    @Override
    public Team saveTeam(Team team)
    {
        return teamRepository.save(team);
    }

    @Override
    public Iterable<Team> saveTeamList(Iterable<Team> teamIterable)
    {
        return teamRepository.save(teamIterable);
    }

    @Override
    public void deleteTeam(Integer id)
    {
        teamRepository.delete(id);
    }
}
