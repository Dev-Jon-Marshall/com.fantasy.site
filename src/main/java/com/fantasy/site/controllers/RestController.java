package com.fantasy.site.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jonathan.Marshall on 4/5/2017.
 */
@Controller
public class RestController
{
    @RequestMapping(value ="/createLeague")
    public String createLeaguePage()
    {
        return "createLeague";
    }

    @RequestMapping("/draft")
    public String draftPage()
    {
        return "draft";
    }

    @RequestMapping("/teamHome")
    public String teamPage()
    {
        return "teamHome";
    }

    @RequestMapping("/matchup")
    public String matchupPage()
    {
        return "matchup";
    }

    @RequestMapping("/leagueHome")
    public String leaguePage()
    {
        return "leagueHome";
    }

    @RequestMapping("/players")
    public String playersPage()
    {
        return "players";
    }

    @RequestMapping("/index")
    public String indexPage()
    {
        return "index";
    }

//    @RequestMapping(value ="/login")
//    public String login()
//    {
//        return "login";
//    }
//
//    @RequestMapping(value ="/registration")
//    public String registration()
//    {
//        return "registration";
//    }
}
