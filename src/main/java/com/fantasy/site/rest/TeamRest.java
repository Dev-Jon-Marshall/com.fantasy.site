package com.fantasy.site.rest;

import com.fantasy.site.domain.Team;
import com.fantasy.site.services.TeamService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jonathan.Marshall on 4/28/2017.
 */
@RestController
@RequestMapping("/api/teamHome")
public class TeamRest
{
    private Logger log = Logger.getLogger(TeamRest.class);
    
    @Autowired
    private TeamService teamService;

    //GET ALL
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Team> getAll()
    {
        return teamService.listAllTeam();
    }
    
    //GET BY ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Team getById(@PathVariable int id)
    {
        return teamService.getTeamById(id);
    }


    
    //POST SAVE
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Team save(@RequestBody Team team)
    {
        return teamService.saveTeam(team);
    }

    //POST DELETE
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean delete(@PathVariable int id)
    {
        boolean result = false;
        try
        {
            teamService.deleteTeam(id);
            result = true;
        }
        catch(Exception ex)
        {
            log.info(ex);
        }
        return result;
    }

}
