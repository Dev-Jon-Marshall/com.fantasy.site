package com.fantasy.site.rest;

import com.fantasy.site.domain.League;
import com.fantasy.site.domain.Team;
import com.fantasy.site.services.LeagueService;
import com.fantasy.site.services.OwnerService;
import com.fantasy.site.services.TeamService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Jonathan.Marshall on 4/5/2017.
 */
@RestController
@RequestMapping("/api/leagueHome")
public class LeagueRest
{
    private Logger log = Logger.getLogger(LeagueRest.class);
    
    @Autowired
    private LeagueService leagueService;

    @Autowired
    private TeamService teamService;

    @Autowired
    private OwnerService ownerService;

    //GET ALL
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<League> getAll()
    {
        return leagueService.listAllLeagues();
    }


    //GET BY ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public League getById(@PathVariable int id)
    {
        return leagueService.getLeagueById(id);
    }


    //POST SAVE
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public League save(@RequestBody League league)
    {
        return leagueService.saveLeague(league);
    }


    //POST DELETE
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean delete(@PathVariable int id)
    {
        boolean result = false;
        try
        {
            leagueService.deleteLeague(id);
            result = true;
        }
        catch(Exception ex)
        {
            log.info(ex);
        }
        return result;
    }


}
