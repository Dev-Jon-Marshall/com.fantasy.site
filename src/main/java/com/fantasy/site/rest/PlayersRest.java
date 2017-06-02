package com.fantasy.site.rest;

import com.fantasy.site.domain.Player;
import com.fantasy.site.services.PlayerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by Jonathan.Marshall on 4/7/2017.
 */
@RestController
@RequestMapping("/api/players")
public class PlayersRest
{
    private Logger log = Logger.getLogger(PlayersRest.class);

    @Autowired
    private PlayerService playerService;

//    PageRequest pageRequest = new PageRequest(0, 20);
    Integer return_Size = 20;


    //GET ALL BY POSITION
    @RequestMapping(value = "/position/{position}/{page}", method = RequestMethod.GET)
    public Iterable<Player> getByPosition(@PathVariable String position, @PathVariable Integer page, Pageable pageRequest) //delete Pageable?!
    {
        Integer active = 1;
        pageRequest = new PageRequest(page, return_Size);
        Iterable<Player> playerIterable = null;
        if (position.equals("ALL")) {
            playerIterable = playerService.getAllActivePlayersByPage(active, pageRequest);
        } else {
            playerIterable = playerService.getAllActivePlayersByPosition(active, position, pageRequest);
        }

        return playerIterable;
    }


    //GET BY ID
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Player getById(@PathVariable Integer id)
    {
        return playerService.getPlayerById(id);
    }


    //POST SAVE
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Player save(@ModelAttribute("player") Player player)
    {
        return playerService.savePlayer(player);
    }

}
